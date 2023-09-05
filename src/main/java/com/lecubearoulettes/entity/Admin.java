package com.lecubearoulettes.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Admin extends Person{

    @Enumerated(EnumType.STRING)
    private Role role;

    public Admin() {
    }

    public Admin(Role role) {
        this.role = role;
    }

    // GETTERS & SETTERS
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
