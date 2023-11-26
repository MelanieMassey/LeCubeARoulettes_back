package com.lecubearoulettes.service;

import com.lecubearoulettes.entity.EventEntity;
import com.lecubearoulettes.entity.UserEntity;

import java.util.List;

public interface EventService {
    List<EventEntity> findAllEvent();
    EventEntity findEventById(Long id);

    EventEntity createAttendeeWithJson(EventEntity eventJson);
    EventEntity deleteEvent(Long id);
    EventEntity updateEvent(EventEntity eventJson);
}
