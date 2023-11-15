//package com.lecubearoulettes.entity;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//import java.util.Collection;
//import java.util.List;
//
//@Entity
//@DiscriminatorValue("Customer")
//public class Customer extends Person implements UserDetails {
//
//    @JsonFormat(pattern="yyyy-MM-dd")
//    private LocalDate birthdate;
//
//    @Embedded
//    private Address address;
//    @Enumerated(EnumType.STRING)
//    private RoleEnum role;
//    @JsonIgnore
//    private String password;
//
//    public Customer() {
//    }
//
//    public Customer(String firstName, String lastName, Title title, String email, String phone, LocalDate birthdate, RoleEnum role) {
//        super(firstName, lastName, title, email, phone);
//        this.birthdate = birthdate;
//        this.role = role;
//    }
//
//    public Customer(String firstName, String lastName, Title title, String email, String phone, LocalDate birthdate, Address address, RoleEnum role) {
//        super(firstName, lastName, title, email, phone);
//        this.birthdate = birthdate;
//        this.address = address;
//        this.role = role;
//    }
//
//    public Customer(String firstName, String lastName, Title title, String email, String phone, LocalDate birthdate, Address address, RoleEnum role, String password) {
//        super(firstName, lastName, title, email, phone);
//        this.birthdate = birthdate;
//        this.address = address;
//        this.role = role;
//        this.password = password;
//    }
//
//    public LocalDate getBirthdate() {
//        return birthdate;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public RoleEnum getRole() {
//        return role;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return List.of(new SimpleGrantedAuthority(role.name()));
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return getEmail();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
