package com.example.spirngbootapp.controller;

import com.example.spirngbootapp.businessService.TopicService;
import com.example.spirngbootapp.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    private TopicService service;

    public TopicService getService() {
        return service;
    }

    @Autowired
    public void setService(TopicService service) {
        this.service = service;
    }

    // Maps the GET Request for a list of all Topics
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return getService().getTopics();
    }

    // Maps the GET Request for a specific Topic
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return service.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        service.addTopic(topic);
    }

}
