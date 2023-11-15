package com.lecubearoulettes.controller;

import com.lecubearoulettes.entity.Attendee;
import com.lecubearoulettes.service.AttendeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AttendeeController {

    private AttendeeService attendeeService;

    @GetMapping("/attendees")
    public ResponseEntity<List<Attendee>> findAllAttendees(){
        List<Attendee> allAttendee = attendeeService.findAllAttendees();
        return new ResponseEntity<>(allAttendee, HttpStatus.OK);
    }

    @GetMapping("/attendees/{id}")
    public ResponseEntity<Attendee> findAttendeeById(@PathVariable Long id){
        Attendee attendee = attendeeService.findAttendeeById(id);
        return new ResponseEntity<>(attendee, HttpStatus.OK);
    }

    @PostMapping("/attendees")
    public ResponseEntity<Attendee> createAttendeeWithJson(@RequestBody Attendee attendeeJson){
        Attendee createdAttendee = attendeeService.createAttendeeWithJson(attendeeJson);
        return new ResponseEntity<>(createdAttendee, HttpStatus.CREATED);
    }

    @DeleteMapping("/attendees/{id}")
    public ResponseEntity<Attendee> deleteAttendeeById(@PathVariable Long id){
        Attendee attendee = attendeeService.deleteAttendee(id);
        return new ResponseEntity<>(attendee, HttpStatus.OK);
    }

    @PutMapping("/attendees")
    public ResponseEntity<Attendee> updateAttendee(@RequestBody Attendee attendeeJson){
        Attendee updatedAttendee = attendeeService.updateAttendee(attendeeJson);
        return new ResponseEntity<>(updatedAttendee, HttpStatus.OK);
    }

    @PutMapping("/attendees/{id}")
    public ResponseEntity<Attendee> updateAttendeeById(@PathVariable Long id, @RequestBody Attendee attendeeJson){
        attendeeJson.setId(id);
        Attendee updatedAttendee = attendeeService.updateAttendee(attendeeJson);
        return new ResponseEntity<>(updatedAttendee, HttpStatus.OK);
    }


    @Autowired
    public void setAttendeeService(AttendeeService attendeeService) {
        this.attendeeService = attendeeService;
    }
}
