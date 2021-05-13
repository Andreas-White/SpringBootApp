package com.example.spirngbootapp.repository;

import com.example.spirngbootapp.model.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Topic,String> {}
