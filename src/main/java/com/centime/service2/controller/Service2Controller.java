package com.centime.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-two")
public class Service2Controller {
    @GetMapping("/get-value")
    public String getValue(){
        return "Hello";
    }
    @GetMapping("/health")
    public String getHealth(){
        return "Up";
    }
}
