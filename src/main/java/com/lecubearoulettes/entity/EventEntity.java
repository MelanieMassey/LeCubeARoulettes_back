package com.lecubearoulettes.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "events")
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate eventDate;
    private String eventLeader;
    private String picture;
    private int minAge;
    private int maxAge;
    private int nbMaxAttendees;
    private int nbRegisteredAttendees;
    @JsonIgnore
    @ManyToMany(mappedBy = "events")
    private List<Attendee> attendees;

    @JsonIgnore
    @ManyToMany(mappedBy = "events")
    private List<UserEntity> users;

}
