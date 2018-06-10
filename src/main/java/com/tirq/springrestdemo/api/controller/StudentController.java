package com.tirq.springrestdemo.api.controller;


import com.tirq.springrestdemo.api.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "students")
public class StudentController {

    @GetMapping
    public List<Student> findAll(){
        return Arrays.asList(new Student("Student 1") , new Student("Student 2"));
    }


}
