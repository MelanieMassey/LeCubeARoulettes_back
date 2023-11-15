package com.lecubearoulettes.entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lecubearoulettes.entity.Title;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto {
    private String firstname;
    private String lastname;
    private Title title;
    private String email;
    private String phone;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate birthdate;
    private String password;

    private Integer streetNumber;
    private String streetType;
    private String streetName;
    private String addressMoreInfo;
    private String zipCode;
    private String city;
}