package com.example.spirngbootapp.controller;

import com.example.spirngbootapp.businessService.CourseService;
import com.example.spirngbootapp.model.Course;
import com.example.spirngbootapp.model.Topic;
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

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id) {
        return getService().getAllCourses(id);
    }

    @RequestMapping("/topics/{id}/courses/{name}")
    public Course getCourse(@PathVariable String name) {
        return getService().getCourse(name);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics/{id}/courses")
    public void addCourse(@RequestBody Course course,@PathVariable String id) {
        course.setTopic(new Topic(id,"",""));
        getService().addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}/courses/{name}")
    public void updateCourse(@RequestBody Course course, @PathVariable String id) {
        course.setTopic(new Topic(id,"",""));
        getService().updateCourse(course);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}/courses/{name}")
    public void deleteCourse(@PathVariable String name) {
        getService().deleteCourse(name);
    }
}
