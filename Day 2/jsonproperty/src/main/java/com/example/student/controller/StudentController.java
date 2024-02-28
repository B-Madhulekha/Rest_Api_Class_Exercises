package com.example.student.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Student;

@RestController
public class StudentController {
    
    @PostMapping("/post")
    public Student postDetails(@RequestBody Student student) {
       System.out.println(student.getName());
       System.out.println(student.getAge());
       return student;
    }

}
