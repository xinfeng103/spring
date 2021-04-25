package com.example.p4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping(value = "/say")
    public @ResponseBody
    String say(String message) {
        return "hello springboot" + message;
    }

    @RequestMapping(value = "/mapvalue")
    @ResponseBody
    public Map<String, Object> mapvalue() {
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("messege", "Springboot project");
        return retMap;
    }
}
