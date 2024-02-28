package com.example.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.person.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person,Integer>{

    List<Person> findAll();

    List<Person> findByAge(int age);

    @SuppressWarnings("unchecked")
    Person save(Person person);
}
