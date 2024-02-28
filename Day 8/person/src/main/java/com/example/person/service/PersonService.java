package com.example.person.service;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.person.model.Person;
import com.example.person.repository.PersonRepo;

@Service
public class PersonService {

    private final PersonRepo personRepo;

    // @Autowired
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public Person createPerson(Person person) {
        return personRepo.save(person);
    }

    public List<Person> getPersonsStartsWithName(String value) {
        return personRepo.findByNameStartingWith(value);
    }

    public List<Person> getPersonsEndsWithName(String value) {
        return personRepo.findByNameEndingWith(value);
    }
}
