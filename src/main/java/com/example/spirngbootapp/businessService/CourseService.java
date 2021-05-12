package com.example.spirngbootapp.businessService;

import com.example.spirngbootapp.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private final List<Course> courses = new ArrayList<Course>() {{
            add(new Course("Algorithms and Data Structures",
                    "A description about Algorithms and Data Structures", 250));
            add(new Course("Spring Boot Tutorial",
                    "A description about Spring Boot Tutorial", 175));
            add(new Course("Concurrency in Java",
                    "A description about Concurrency in Java", 100));
        }
    };

    public List<Course> getAllCourses() {
        return courses;
    }

    public Course getCourse(String name) {
        for (Course c : getAllCourses()) {
            if (c.getName().equals(name))
                return c;
        }
        return null;
    }

    public void updateCourse(String name, Course course) {
        int count = 0;
        for (Course c : getAllCourses()) {
            if (c.getName().equals(name))
                getAllCourses().set(count,course);
            count++;
        }
    }

    public void deleteCourse(String name) {
        getAllCourses().remove(getCourse(name));
    }

    public void addCourse(Course course) {
        getAllCourses().add(course);
    }
}
