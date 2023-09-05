package com.lecubearoulettes.repository;

import com.lecubearoulettes.entity.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeeDao extends JpaRepository<Attendee, Long> {
}
