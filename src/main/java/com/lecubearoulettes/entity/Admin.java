package com.lecubearoulettes.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Admin extends Person{

    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    public Admin() {
    }

    public Admin(RoleEnum role) {
        this.role = role;
    }

    // GETTERS & SETTERS
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }
}
