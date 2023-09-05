package com.lecubearoulettes.repository;

import com.lecubearoulettes.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person, Long> {
}
