package com.practice.practice_project.practice_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloJava {
    
    @GetMapping("hello")
    public String sayHello(){
        return "Hello World";
    }
}
