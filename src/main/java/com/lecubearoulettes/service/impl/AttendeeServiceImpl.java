package com.lecubearoulettes.service.impl;
import com.lecubearoulettes.entity.Attendee;
import com.lecubearoulettes.exception.AttendeeException;
import com.lecubearoulettes.repository.AttendeeRepository;
import com.lecubearoulettes.service.AttendeeService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AttendeeServiceImpl implements AttendeeService {

    private AttendeeRepository attendeeRepository;

    @Override
    public List<Attendee> findAllAttendees() {
        return attendeeRepository.findAll();
    }

    @Override
    public Attendee findAttendeeById(Long id) {
        Optional<Attendee> optionalAttendee = attendeeRepository.findById(id);
        if(optionalAttendee.isPresent()) return optionalAttendee.get();
        else throw new AttendeeException("Attendee not found with given id: " + id);
    }

    @Override
    public Attendee createAttendeeWithJson(Attendee attendeeJson) {
        return attendeeRepository.save(attendeeJson);
    }

    @Override
    public Attendee deleteAttendee(Long id) {
        Optional<Attendee> optionalAttendee = attendeeRepository.findById(id);
        if (optionalAttendee.isPresent()){
            Attendee attendee = optionalAttendee.get();
            attendeeRepository.delete(attendee);
            return attendee;
        }
        else throw new AttendeeException("Attendee not found with the id: " + id);
    }

    @Override
    public Attendee updateAttendee(Attendee attendeeJson) {
        Attendee existingAttendee = attendeeRepository.findById(attendeeJson.getId()).orElseThrow(()-> new AttendeeException("Attendee not found with the id: " + attendeeJson.getId()));

        // Si existing le code continue, sinon exception renvoyée
        return attendeeRepository.save(attendeeJson);
    }


}
