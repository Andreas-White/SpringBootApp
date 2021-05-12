package com.example.spirngbootapp.controller;

import com.example.spirngbootapp.businessService.CourseService;
import com.example.spirngbootapp.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    private CourseService service;

    public CourseService getService() {
        return service;
    }

    @Autowired
    public void setService(CourseService service) {
        this.service = service;
    }

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        return getService().getAllCourses();
    }
}
