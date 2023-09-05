package com.lecubearoulettes.entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="person_type")
//@Table(
//        uniqueConstraints = {
//                @UniqueConstraint(name = "email_unique", columnNames = "email")
//        }
//)
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            nullable = false
    )
    private String firstName;

    @Column(
            nullable = false
    )
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Title title;

    @Column(
            nullable = false
    )
    private String email;



    public Person() {
    }

    public Person(String firstName, String lastName, Title title, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

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

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
