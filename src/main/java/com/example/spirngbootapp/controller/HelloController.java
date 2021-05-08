package com.example.spirngbootapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:application.properties")
public class HelloController {

    private String value;

    public String getValue() {
        return value;
    }

    @Value("${springBootHistory}")
    public void setValue(String value) {
        this.value = value;
    }

    @RequestMapping("/hello")
    public String sayHello() {
        return "<h1>Hello</h1>\n<p>" +getValue()+ "</p>";
    }

    @RequestMapping("/")
    public String introduce() {
        return "<h1>This is a Spring Boot Application Test</h1>";
    }
}
