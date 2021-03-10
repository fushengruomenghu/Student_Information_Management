package com.example.homework1.controller;

import com.example.homework1.entity.Grade;
import com.example.homework1.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/g")
public class GradeController  {
    @Autowired
    private GradeService gradeService;
}
