package com.lecubearoulettes.controller;

import com.lecubearoulettes.entity.EventEntity;
import com.lecubearoulettes.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("${front.url}")
public class EventController {

    // Injecté par le setter
    EventService eventService;

    @GetMapping("/events")
    public List<EventEntity> findAllEvents(){
        return eventService.findAllEvent();
    }

    @Autowired
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

}
