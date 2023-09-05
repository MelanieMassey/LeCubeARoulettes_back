package com.lecubearoulettes.controller;

import com.lecubearoulettes.entity.Admin;
import com.lecubearoulettes.entity.EventLeader;
import com.lecubearoulettes.service.EventLeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventLeaderController {

    EventLeaderService eventLeaderService;

    @GetMapping("/event-leaders")
    public ResponseEntity<List<EventLeader>> findAllAdmins(){
        List<EventLeader> allEventLeader = eventLeaderService.findAllEventLeaders();
        return new ResponseEntity<>(allEventLeader, HttpStatus.OK);
    }

    @GetMapping("/event-leaders/{id}")
    public ResponseEntity<EventLeader> findEventLeaderById(@PathVariable Long id){
        EventLeader eventLeader = eventLeaderService.findEventLeaderById(id);
        return new ResponseEntity<>(eventLeader, HttpStatus.OK);
    }

    @PostMapping("/event-leaders")
    public ResponseEntity<EventLeader> createEventLeaderWithJson(@RequestBody EventLeader eventLeaderJson){
        EventLeader createdEventLeader = eventLeaderService.createEventLeaderWithJSon(eventLeaderJson);
        return new ResponseEntity<>(createdEventLeader, HttpStatus.CREATED);
    }

    @DeleteMapping("/event-leaders/{id}")
    public ResponseEntity<EventLeader> deleteEventLeaderById(@PathVariable Long id){
        EventLeader eventLeader = eventLeaderService.deleteEventLeader(id);
        return new ResponseEntity<>(eventLeader, HttpStatus.OK);
    }

    @PutMapping("/event-leaders")
    public ResponseEntity<EventLeader> updateEventLeader(@RequestBody EventLeader eventLeaderJson){
        EventLeader updatedEventLeader = eventLeaderService.updateEventLeader(eventLeaderJson);
        return new ResponseEntity<>(updatedEventLeader, HttpStatus.OK);
    }

    @PutMapping("/event-leaders/{id}")
    public ResponseEntity<EventLeader> updateEventLeaderById(@PathVariable Long id, @RequestBody EventLeader eventLeaderJson){
        eventLeaderJson.setId(id);
        EventLeader updatedEventLeader = eventLeaderService.updateEventLeader(eventLeaderJson);
        return new ResponseEntity<>(updatedEventLeader, HttpStatus.OK);
    }

    // SETTER SERVICE - injection
    @Autowired
    public void setEventLeaderService(EventLeaderService eventLeaderService) {
        this.eventLeaderService = eventLeaderService;
    }
}
