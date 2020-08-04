package com.example.docker.sample.Interface;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/docker")
public class Controller {

    @GetMapping
    public String sampleMethod(){
        return "Sample String from Sample Application";
    }
}
