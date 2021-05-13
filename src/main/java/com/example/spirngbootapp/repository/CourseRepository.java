package com.example.spirngbootapp.repository;

import com.example.spirngbootapp.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String> {}
