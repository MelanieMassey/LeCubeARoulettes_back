package com.lecubearoulettes.entity.dto;

import com.lecubearoulettes.entity.RoleEntity;
import com.lecubearoulettes.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuthResponseDto {
    private UserEntity user;
    List<RoleEntity> roles = new ArrayList<>();
    private String accessToken;
    private String tokenType = "Bearer ";


    public AuthResponseDto(String accessToken){
        this.accessToken = accessToken;
    }

    public AuthResponseDto(UserEntity user, String token) {
        this.user = user;
        this.accessToken = token;
    }
    public AuthResponseDto(UserEntity user, List<RoleEntity> roles, String token) {
        this.user = user;
        this.roles = roles;
        this.accessToken = token;
    }
}
