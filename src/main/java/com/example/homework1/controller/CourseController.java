package com.example.homework1.controller;

import com.example.homework1.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c")
public class CourseController {
    @Autowired
    private CourseService courseService;
}
