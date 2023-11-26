package com.lecubearoulettes.repository;

import com.lecubearoulettes.entity.EventEntity;
import com.lecubearoulettes.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<EventEntity, Long> {


}
