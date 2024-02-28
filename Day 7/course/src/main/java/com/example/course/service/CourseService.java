package com.example.course.service;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.model.Course;
import com.example.course.repository.CourseRepo;

@Service
public class CourseService {

    private final CourseRepo courseRepo;

    // @Autowired
    public CourseService(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    public Course createCourse(Course course) {
        return courseRepo.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public List<Course> getCoursesByCourseName(String courseName) {
        return courseRepo.findByCourseName(courseName);
    }
}
