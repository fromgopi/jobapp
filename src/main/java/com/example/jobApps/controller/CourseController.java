package com.example.jobApps.controller;

import com.example.jobApps.beans.Courses;
import com.example.jobApps.dao.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository repository;


    @RequestMapping("/courses")
    public List<Courses> getAllCourses(){
        return repository.findAll();
    }
}
