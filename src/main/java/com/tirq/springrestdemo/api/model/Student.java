package com.tirq.springrestdemo.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Student {

    private Long id;
    private String name;


    public static List<Student> findAll() {
        return new ArrayList<>(Arrays.asList(new Student(1L, "Student 1"), new Student(2L, "Student 2")));
    }
}
