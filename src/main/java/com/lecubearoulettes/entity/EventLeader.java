package com.lecubearoulettes.entity;

import javax.persistence.Entity;

@Entity
public class EventLeader extends Person{

    private String companyName;
    private String jobTitle;
    private String phone;

    public EventLeader() {
    }

    public EventLeader(String firstName, String lastName, Title title, String email, String companyName, String jobTitle, String phone) {
        super(firstName, lastName, title, email);
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.phone = phone;
    }

    // GETTERS & SETTERS
    public String getCompanyName() {
        return companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getPhone() {
        return phone;
    }
}
