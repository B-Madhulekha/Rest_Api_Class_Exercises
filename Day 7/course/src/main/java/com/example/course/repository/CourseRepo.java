package com.example.course.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.course.model.Course;

@Repository
public interface CourseRepo {

    List<Course> findAll();

    List<Course> findByCourseName(String courseName);

    Course save(Course course);
}
