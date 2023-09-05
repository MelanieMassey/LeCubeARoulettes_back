package com.lecubearoulettes.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Customer extends Person {

    private String phone;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate birthdate;

    @Embedded
    private Address address;
    @Enumerated(EnumType.STRING)
    private Role role;

    public Customer() {
    }

    public Customer(String firstName, String lastName, Title title, String email, String phone, LocalDate birthdate, Role role) {
        super(firstName, lastName, title, email);
        this.phone = phone;
        this.birthdate = birthdate;
        this.role = role;
    }

    public Customer(String firstName, String lastName, Title title, String email, String phone, LocalDate birthdate, Address address, Role role) {
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

    public Role getRole() {
        return role;
    }

}
