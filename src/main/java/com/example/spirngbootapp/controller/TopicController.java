package com.example.spirngbootapp.controller;

import com.example.spirngbootapp.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("spring","Spring Framework","Spring Framework Description"),
                new Topic("java","Core Java language","Core java language description"),
                new Topic("javascript","Core JavaScript language","Core javascript language description")
        );
    }
}
