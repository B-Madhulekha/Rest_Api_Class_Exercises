package com.example.person.service;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.person.model.Person;
import com.example.person.repository.PersonRepo;

@Service
public class PersonService {

    private final PersonRepo personRepo;

    
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public Person createPerson(Person person) {
        return personRepo.save(person);
    }

    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }

    public List<Person> getPersonsByAge(int age) {
        return personRepo.findByAge(age);
    }
}
