package com.lxf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String index() {
        return "this is indexController index method";
    }
}
