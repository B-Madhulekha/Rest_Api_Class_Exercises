package com.example.person.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.person.model.Person;

public interface PersonRepo extends CrudRepository<Person, Integer> {

    List<Person> findByAge(int age);
}