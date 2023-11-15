package com.lecubearoulettes.controller;

import com.lecubearoulettes.entity.Address;
import com.lecubearoulettes.entity.RoleEntity;
import com.lecubearoulettes.entity.UserEntity;
import com.lecubearoulettes.entity.dto.AuthResponseDto;
import com.lecubearoulettes.entity.dto.LoginDto;
import com.lecubearoulettes.entity.dto.RegisterDto;
import com.lecubearoulettes.repository.RoleRepository;
import com.lecubearoulettes.repository.UserRepository;
//import com.lecubearoulettes.security.JWTGenerator;
import com.lecubearoulettes.security.JWTGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {


    private AuthenticationManager authenticationManager;
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;
    private JWTGenerator jwtGenerator;
//
    @Autowired
    public AuthController(AuthenticationManager authenticationManager, UserRepository userRepository,
                          RoleRepository roleRepository, PasswordEncoder passwordEncoder, JWTGenerator jwtGenerator) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtGenerator = jwtGenerator;
    }
//
    @PostMapping("login")
    public ResponseEntity<AuthResponseDto> login(@RequestBody LoginDto loginDto){

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginDto.getEmail(),
                        loginDto.getPassword()));
        // Stockage de notre objet authentication dans le context
        SecurityContextHolder.getContext().setAuthentication(authentication);
        // Génère le token
        String token = jwtGenerator.generateToken(authentication);
        return new ResponseEntity<>(new AuthResponseDto(token), HttpStatus.OK);
    }
//

    @PostMapping("register")
    public ResponseEntity<String> register(@RequestBody RegisterDto registerDto) {

        if (userRepository.existsByEmail(registerDto.getEmail())) {
            return new ResponseEntity<>("Username is taken!", HttpStatus.BAD_REQUEST);
        }

        Address address = new Address();
        address.setStreetNumber(registerDto.getStreetNumber());
        address.setStreetType(registerDto.getStreetType());
        address.setStreetName(registerDto.getStreetName());
        address.setAddressMoreInfo(registerDto.getAddressMoreInfo());
        address.setZipCode(registerDto.getZipCode());
        address.setCity(registerDto.getCity());

        UserEntity user = new UserEntity();
        user.setFirstName(registerDto.getFirstname());
        user.setLastName(registerDto.getLastname());
        user.setTitle(registerDto.getTitle());
        user.setEmail(registerDto.getEmail());
        user.setPhone(registerDto.getPhone());
        user.setBirthdate(registerDto.getBirthdate());
        user.setPassword(passwordEncoder.encode((registerDto.getPassword())));

        user.setAddress(address);

        RoleEntity roles = roleRepository.findByRolename("USER").get();
        user.setRoles(Collections.singletonList(roles));

        userRepository.save(user);

        return new ResponseEntity<>("User registered success!", HttpStatus.OK);
    }
}