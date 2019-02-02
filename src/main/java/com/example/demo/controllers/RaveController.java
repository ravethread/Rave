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


    @RequestMapping("/contact")
    public String contact(){
        return "contact_page";
    }
    @RequestMapping("/contactSuccess")
    @ResponseBody
    public String contactSuccess(){
        return "Thank you for contacting us.";
    }
}
