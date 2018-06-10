package com.tirq.springrestdemo.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping(produces = "application/json")
    public String sayHello(){
        return "Hello from hello controller ;)";
    }

}
