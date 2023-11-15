//package com.lecubearoulettes.entity;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import javax.persistence.DiscriminatorValue;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//
//@Entity
//@DiscriminatorValue("Admin")
//public class Admin extends Person{
//
//    @Enumerated(EnumType.STRING)
//    private RoleEnum role;
//
//    @JsonIgnore
//    private String password;
//
//    public Admin() {
//    }
//
//    public Admin(String firstName, String lastName, Title title, String email, String phone, RoleEnum role) {
//        super(firstName, lastName, title, email, phone);
//        this.role = role;
//    }
//
//    public Admin(String firstName, String lastName, Title title, String email, String phone, RoleEnum role, String password) {
//        super(firstName, lastName, title, email, phone);
//        this.role = role;
//        this.password = password;
//    }
//
//    // GETTERS & SETTERS
//    public RoleEnum getRole() {
//        return role;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setRole(RoleEnum role) {
//        this.role = role;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}
