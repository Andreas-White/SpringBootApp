package com.example.spirngbootapp.controller;

import com.example.spirngbootapp.businessService.CourseService;
import com.example.spirngbootapp.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/courses/{name}")
    public Course getCourse(@PathVariable String name) {
        return getService().getCourse(name);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/courses")
    public void addCourse(@RequestBody Course course) {
        getService().addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/courses/{name}")
    public void updateCourse(@RequestBody Course course) {
        getService().updateCourse(course);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/courses/{name}")
    public void deleteCourse(@PathVariable String name) {
        getService().deleteCourse(name);
    }
}
