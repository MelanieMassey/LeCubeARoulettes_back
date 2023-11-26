package com.lecubearoulettes.service.impl;

import com.lecubearoulettes.entity.Attendee;
import com.lecubearoulettes.entity.EventEntity;
import com.lecubearoulettes.entity.UserEntity;
import com.lecubearoulettes.exception.AttendeeException;
import com.lecubearoulettes.exception.EventException;
import com.lecubearoulettes.repository.EventRepository;
import com.lecubearoulettes.service.EventService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;

    @Override
    public List<EventEntity> findAllEvent() {
        return eventRepository.findAll();
    }


    @Override
    public EventEntity findEventById(Long id) {
        Optional<EventEntity> optionalEvent = eventRepository.findById(id);
        if(optionalEvent.isPresent()) return optionalEvent.get();
        else throw new EventException("Event not found with given id: " + id);
    }

    @Override
    public EventEntity createAttendeeWithJson(EventEntity eventJson) {
        return eventRepository.save(eventJson);
    }

    @Override
    public EventEntity deleteEvent(Long id) {
        Optional<EventEntity> optionalEvent = eventRepository.findById(id);
        if (optionalEvent.isPresent()){
            EventEntity event = optionalEvent.get();
            eventRepository.delete(event);
            return event;
        }
        else throw new EventException("Event not found with the id: " + id);
    }

    @Override
    public EventEntity updateEvent(EventEntity eventJson) {
        EventEntity existingEvent = eventRepository.findById(eventJson.getId()).orElseThrow(()-> new EventException("Event not found with the id: " + eventJson.getId()));

        // Si existing le code continue, sinon exception renvoyée
        return eventRepository.save(eventJson);
    }
}
