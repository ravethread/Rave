package com.example.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RaveController {

    @RequestMapping(value = "")

    public String index(Model model){

        model.addAttribute("title", "Home");
        return "index.html";
    }

    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("title", "Login");
        return "login";
    }

    @RequestMapping("/signup")
    public String signup(Model model){
        model.addAttribute("title", "Signup");
        return "signup";
    }

    @RequestMapping("/profile")
    public String profile(Model model){
        model.addAttribute("title", "Profile");
        return "profile";
    }

    @RequestMapping("/dashboard")
    public String dashboard(Model model){
        model.addAttribute("title", "Dashboard");
        return "dashboard";
    }


    @RequestMapping("/contact")
    public String contact(Model model){
        model.addAttribute("title", "Contact");
        return "contact_page";
    }

    @RequestMapping("/contactSuccess")
    @ResponseBody
    public String contactSuccess(){
        return "Thank you for contacting us.";
    }
}
