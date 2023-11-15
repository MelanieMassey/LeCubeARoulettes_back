//package com.lecubearoulettes.controller;
//
//import com.lecubearoulettes.entity.Person;
//import com.lecubearoulettes.service.PersonService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class PersonController {
//
//    PersonService personService;
//
//    @GetMapping("/persons")
//    public ResponseEntity<List<Person>> findAllPersons(){
//        List<Person> allPersons = personService.findAllPersons();
//        return new ResponseEntity<>(allPersons, HttpStatus.OK);
//    }
//
//    @Autowired
//    public void setPersonService(PersonService personService) {
//        this.personService = personService;
//    }
//}
