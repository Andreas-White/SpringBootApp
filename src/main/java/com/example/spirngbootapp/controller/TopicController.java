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
        return getService().getTopic(id);
    }

    // Handles the POST Request by converting a JSON object to a Topic
    // object and adds it to the topics list
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        getService().addTopic(topic);
    }

    // Handles the PUT Request by converting a JSON object to a Topic
    // object and updates the specific topic in the list
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        getService().updateTopic(id, topic);
    }

    // Handles the DELETE Request by converting a JSON object to a Topic
    // object and deletes the specific topic in the list
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        getService().deleteTopic(id);
    }
}
