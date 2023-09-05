package com.lecubearoulettes.service.impl;

import com.lecubearoulettes.entity.Admin;
import com.lecubearoulettes.entity.Attendee;
import com.lecubearoulettes.exception.AdminException;
import com.lecubearoulettes.exception.AttendeeException;
import com.lecubearoulettes.repository.AttendeeDao;
import com.lecubearoulettes.service.AttendeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttendeeServiceImpl implements AttendeeService {

    private AttendeeDao attendeeDao;

    @Override
    public List<Attendee> findAllAttendees() {
        return attendeeDao.findAll();
    }

    @Override
    public Attendee findAttendeeById(Long id) {
        Optional<Attendee> optionalAttendee = attendeeDao.findById(id);
        if(optionalAttendee.isPresent()) return optionalAttendee.get();
        else throw new AttendeeException("Attendee not found with given id: " + id);
    }

    @Override
    public Attendee createAttendeeWithJson(Attendee attendeeJson) {
        return attendeeDao.save(attendeeJson);
    }

    @Override
    public Attendee deleteAttendee(Long id) {
        Optional<Attendee> optionalAttendee = attendeeDao.findById(id);
        if (optionalAttendee.isPresent()){
            Attendee attendee = optionalAttendee.get();
            attendeeDao.delete(attendee);
            return attendee;
        }
        else throw new AttendeeException("Attendee not found with the id: " + id);
    }

    @Override
    public Attendee updateAttendee(Attendee attendeeJson) {
        Attendee existingAttendee = attendeeDao.findById(attendeeJson.getId()).orElseThrow(()-> new AttendeeException("Attendee not found with the id: " + attendeeJson.getId()));

        // Si existingAdmin le code continue, sinon exception renvoyée
        return attendeeDao.save(attendeeJson);
    }


    @Autowired
    public void setAttendeeDao(AttendeeDao attendeeDao) {
        this.attendeeDao = attendeeDao;
    }
}
