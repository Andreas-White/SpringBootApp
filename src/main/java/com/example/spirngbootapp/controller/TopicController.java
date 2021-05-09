package com.example.spirngbootapp.controller;

import com.example.spirngbootapp.businessService.TopicService;
import com.example.spirngbootapp.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return getService().getTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return service.getTopic(id);
    }
}
