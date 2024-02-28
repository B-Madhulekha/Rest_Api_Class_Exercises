package com.example.student.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {
    
} 

