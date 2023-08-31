package com.lecubearoulettes.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customers")
public class Customer extends Person {

    private String phone;
    private Date birthdate;
//    @Enumerated(EnumType.STRING)
//    @ManyToOne
    @Embedded
    private Address address;
    @Enumerated(EnumType.STRING)
    private Role role;

    public Customer() {
    }

    public Customer(String firstName, String lastName, Title title, String email, String phone, Date birthdate, Role role) {
        super(firstName, lastName, title, email);
        this.phone = phone;
        this.birthdate = birthdate;
        this.role = role;
    }

    public Customer(String firstName, String lastName, Title title, String email, String phone, Date birthdate, Address address, Role role) {
        super(firstName, lastName, title, email);
        this.phone = phone;
        this.birthdate = birthdate;
        this.address = address;
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public Address getAddress() {
        return address;
    }

    public Role getRole() {
        return role;
    }


}
