package com.example.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.person.model.Person;;

@Repository
public interface PersonRepo extends JpaRepository<Person,Integer>{

    List<Person> findByNameStartingWith(String value);

    List<Person> findByNameEndingWith(String value);

    Person save(Person person);
}
