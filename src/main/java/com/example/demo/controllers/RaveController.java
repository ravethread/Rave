package com.example.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RaveController {

    @RequestMapping(value = "")

    public String index(){
        return "index.html";
    }
}
