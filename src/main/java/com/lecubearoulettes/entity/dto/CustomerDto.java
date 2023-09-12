package com.lecubearoulettes.entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lecubearoulettes.entity.RoleEnum;
import com.lecubearoulettes.entity.Title;

import java.time.LocalDate;

public class CustomerDto {

    private String firstName;
    private String lastName;
    private Title title;
    private String email;
    private String phone;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate birthdate;
    private RoleEnum role;
    private Integer streetNumber;
    private String streetType;
    private String streetName;
    private String addressMoreInfo;
    private String zipCode;
    private String city;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Title getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public RoleEnum getRole() {
        return role;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public String getStreetType() {
        return streetType;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getAddressMoreInfo() {
        return addressMoreInfo;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }
}
