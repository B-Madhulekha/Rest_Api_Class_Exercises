package com.example.person.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Person {

    private int personId;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String email;

    public Person() {
    }

    public Person(int personId, String firstName, String lastName, int age, String gender, String email) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    
}