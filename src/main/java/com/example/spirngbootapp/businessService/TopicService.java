package com.example.spirngbootapp.businessService;

import com.example.spirngbootapp.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("spring","Spring Framework","Spring Framework Description"),
            new Topic("java","Core Java language","Core java language description"),
            new Topic("javascript","Core JavaScript language","Core javascript language description")
    );

    public List<Topic> getTopics() {
        return topics;
    }
}
