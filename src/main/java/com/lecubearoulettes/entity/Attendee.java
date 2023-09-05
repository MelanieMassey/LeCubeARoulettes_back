package com.lecubearoulettes.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Attendee extends Person{

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate birthdate;

    public Attendee() {
    }

    public Attendee(String firstName, String lastName, Title title, String email, LocalDate birthdate) {
        super(firstName, lastName, title, email);
        this.birthdate = birthdate;
    }

    // GETTERS & SETTERS
    public LocalDate getBirthdate() {
        return birthdate;
    }
}
