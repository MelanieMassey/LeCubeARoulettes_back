package com.lecubearoulettes.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(
//            nullable = false
//    )
    private String firstName;

//    @Column(
//            nullable = false
//    )
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Title title;

//    @Column(
//            nullable = false
//    )
    private String email;

//    @Column(
//            nullable = false
//    )
    private String phone;

    private Integer streetNumber;
    private String streetName;
    private String zipCode;
    private String city;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate birthdate;

    @JsonIgnore
    private String password;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL) // EAGER > when we load a user we always want the role to be shown
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private List<RoleEntity> roles = new ArrayList<>();

    @JsonIgnore
    @LazyCollection(LazyCollectionOption.FALSE)
    @ManyToMany
    @JoinTable(name = "users_events", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "event_id", referencedColumnName = "id"))
    private List<EventEntity> events = new ArrayList<>();

    @JsonIgnore
    @LazyCollection(LazyCollectionOption.TRUE)
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "users_attendees", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "attendee_id", referencedColumnName = "id"))
    private List<Attendee> attendees = new ArrayList<>();
}
