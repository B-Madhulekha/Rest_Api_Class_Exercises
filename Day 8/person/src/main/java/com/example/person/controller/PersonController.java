package com.example.person.controller;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.person.model.Person;
import com.example.person.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    // @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        Person createdPerson = personService.createPerson(person);
        return new ResponseEntity<>(createdPerson, HttpStatus.CREATED);
    }

    @GetMapping("/startsWithName/{value}")
    public ResponseEntity<List<Person>> getPersonStartsWithName(@PathVariable String value) {
        List<Person> persons = personService.getPersonsStartsWithName(value);
        return new ResponseEntity<>(persons, HttpStatus.OK);
    }

    @GetMapping("/endsWithName/{value}")
    public ResponseEntity<List<Person>> getPersonEndsWithName(@PathVariable String value) {
        List<Person> persons = personService.getPersonsEndsWithName(value);
        return new ResponseEntity<>(persons, HttpStatus.OK);
    }
}
