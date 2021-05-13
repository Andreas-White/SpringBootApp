package com.example.spirngbootapp.businessService;

import com.example.spirngbootapp.model.Topic;
import com.example.spirngbootapp.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    private TopicRepository repository;

    public TopicRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(TopicRepository repository) {
        this.repository = repository;
    }

    // Return a list of all Topics
    public List<Topic> getTopics() {
        List<Topic> topicList = new ArrayList<>();
        for (Topic t : repository.findAll())
            topicList.add(t);
        return topicList;
    }

    // Returns a specific Topic according to the given ID
    public Topic getTopic(String id) {
        return  repository.findById(id).orElseThrow();
    }

    // Adds a new Topic to the topics list
    public void addTopic(Topic topic) {
        repository.save(topic);
    }

    // Updates a specific topic in the list
    public void updateTopic(Topic topic) {
        repository.save(topic);
    }

    // Deletes a specific Topic from the list
    public void deleteTopic(String id) {
        repository.deleteById(id);
    }

}
