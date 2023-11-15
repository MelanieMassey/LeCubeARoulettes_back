//package com.lecubearoulettes.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Entity
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
//@Inheritance(strategy = InheritanceType.JOINED)
////@DiscriminatorColumn(name="person_type") -- si utilisation des entités Customer et Admin
////@Table(
////        uniqueConstraints = {
////                @UniqueConstraint(name = "email_unique", columnNames = "email")
////        }
////)
//public abstract class Person {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(
//            nullable = false
//    )
//    private String firstName;
//
//    @Column(
//            nullable = false
//    )
//    private String lastName;
//
//    @Enumerated(EnumType.STRING)
//    private Title title;
//
//    @Column(
//            nullable = false
//    )
//    private String email;
//
//    @Column(
//            nullable = false
//    )
//    private String phone;
//
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public Title getTitle() {
//        return title;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPhone() { return phone;}
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public void setTitle(Title title) {
//        this.title = title;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//}
