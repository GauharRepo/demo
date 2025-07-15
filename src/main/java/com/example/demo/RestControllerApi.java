package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerApi {

    @GetMapping("/hello")
    public String getString(){
        return "hello world from spring boot";
    }
}
