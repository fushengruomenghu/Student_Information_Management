package com.example.homework1.controller;

import com.example.homework1.service.ScService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/SC")
public class ScController {
    @Autowired
    private ScService scService;
}
