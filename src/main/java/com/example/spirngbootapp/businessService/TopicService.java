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

    // Return a list of all Topics
    public List<Topic> getTopics() {
        return topics;
    }

    // Returns a specific Topic according to the given ID
    public Topic getTopic(String id) {
        // A handy way with use of Lambda expressions
        //return getTopics().stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
        for (Topic t: topics) {
            if (t.getId().equals(id))
                return t;
        }
        return null;
    }

    public void addTopic(Topic topic) {
        getTopics().add(topic);
    }

}
