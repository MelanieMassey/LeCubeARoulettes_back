package com.lecubearoulettes.service;

import com.lecubearoulettes.entity.Attendee;

import java.util.List;

public interface AttendeeService {
    List<Attendee> findAllAttendees();
    Attendee findAttendeeById(Long id);
    Attendee createAttendeeWithJson(Attendee attendeeJson);
    Attendee deleteAttendee(Long id);
    Attendee updateAttendee(Attendee attendeeJson);
}
