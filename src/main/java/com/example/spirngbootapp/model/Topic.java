package com.example.spirngbootapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

    @Id
    private String topic_id;
    private String name;
    private String description;

    public Topic(String topic_id, String name, String description) {
        this.topic_id = topic_id;
        this.name = name;
        this.description = description;
    }

    public Topic() {}

    public String getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(String id) {
        this.topic_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
