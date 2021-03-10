package com.example.homework1.controller;

import com.example.homework1.service.StudentService;
import com.example.homework1.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Stu")
public class StudentController {
    @Autowired
    private StudentService studentService;
}
