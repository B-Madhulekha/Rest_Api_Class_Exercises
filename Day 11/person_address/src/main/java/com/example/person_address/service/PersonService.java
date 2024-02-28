package com.example.person_address.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.person_address.model.Person;

public interface PersonService extends JpaRepository<Person,Long>{
    Person createPerson(Person person);
    List<Person> getAllPersons();
    Person getPersonById(Long personId);
}