package com.tirq.springrestdemo.api.controller;


import com.tirq.springrestdemo.api.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "students")
public class StudentController {

    @GetMapping
    public List<Student> findAll() {
        return Student.findAll();
    }

    @GetMapping(path = "/{id}")
    public Student findById(@PathVariable int id) throws Exception {
        List<Student> students = Student.findAll();
        Student s = new Student();
        s.setId(new Long(id));
        int index = students.indexOf(s);
        if (index >= 0) return students.get(index);
        throw new Exception("Student doesn't exist.");
    }


}
