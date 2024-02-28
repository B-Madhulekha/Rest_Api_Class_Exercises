package com.example.jsonignore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsonignore.model.Student;

@RestController
public class StudentController {

    @GetMapping("/stu")
    public Student getVal() {
        Student st = new Student(99, "Madhu", "good");
        return st;
      }

}

