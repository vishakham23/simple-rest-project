package com.devops.provider.simple_rest_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot with Java 17!";
    }
}
