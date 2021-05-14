package com.example.spirngbootapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {

    @Id
    private String name;
    private String description;
    private int price;
    @ManyToOne
    private Topic topic;

    public Course() {}

    public Course(String name, String description, int price, String topicId) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.topic = new Topic(topicId,"","");
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
