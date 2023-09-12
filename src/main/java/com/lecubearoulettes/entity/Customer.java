package com.lecubearoulettes.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Customer extends Person {

    private String phone;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate birthdate;

    @Embedded
    private Address address;
    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    public Customer() {
    }

    public Customer(String firstName, String lastName, Title title, String email, String phone, LocalDate birthdate, RoleEnum role) {
        super(firstName, lastName, title, email);
        this.phone = phone;
        this.birthdate = birthdate;
        this.role = role;
    }

    public Customer(String firstName, String lastName, Title title, String email, String phone, LocalDate birthdate, Address address, RoleEnum role) {
        super(firstName, lastName, title, email);
        this.phone = phone;
        this.birthdate = birthdate;
        this.address = address;
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public Address getAddress() {
        return address;
    }

    public RoleEnum getRole() {
        return role;
    }

}
