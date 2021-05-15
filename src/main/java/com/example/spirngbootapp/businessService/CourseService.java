package com.example.spirngbootapp.businessService;

import com.example.spirngbootapp.model.Course;
import com.example.spirngbootapp.model.Topic;
import com.example.spirngbootapp.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private CourseRepository repository;

    public CourseRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(CourseRepository repository) {
        this.repository = repository;
    }

    public Iterable<Course> getAllCourses() {
        return repository.findAll();
    }

    public List<Course> getAllCoursesByPrice(int price) {
        return repository.findCourseByPrice(price);
    }

    public Course getCourse(String name) {
        return repository.findById(name).orElseThrow();
    }

    public void updateCourse(Course course) {
        repository.save(course);
    }

    public void deleteCourse(String name) {
        repository.deleteById(name);
    }

    public void addCourse(Course course) {
        repository.save(course);
    }
}
