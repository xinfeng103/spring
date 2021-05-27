package com.example.testthemleaf.controller;

import com.example.testthemleaf.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("student", new Student("我没有三颗心脏", 1));
        return "hello";
    }
}

