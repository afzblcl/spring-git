package com.entor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "sb";
    }

    @RequestMapping("/good")
    @ResponseBody
    public String good(){
        return "nt";
    }
}
