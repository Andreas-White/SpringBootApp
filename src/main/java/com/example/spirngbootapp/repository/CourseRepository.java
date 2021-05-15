package com.example.spirngbootapp.repository;

import com.example.spirngbootapp.model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    List<Course> findCourseByPrice(int price);

}
