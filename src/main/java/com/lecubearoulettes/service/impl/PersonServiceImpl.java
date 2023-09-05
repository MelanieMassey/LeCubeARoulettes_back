package com.lecubearoulettes.service.impl;

import com.lecubearoulettes.entity.Person;
import com.lecubearoulettes.repository.PersonDao;
import com.lecubearoulettes.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonDao personDao;

    @Override
    public List<Person> findAllPersons() {
        return personDao.findAll();
    }

    @Autowired
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }
}
