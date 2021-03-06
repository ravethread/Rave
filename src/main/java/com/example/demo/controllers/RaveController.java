package com.example.demo.controllers;

import com.example.demo.MovieDetails;
import com.example.demo.services.MovieDetailsSearchResponse;
import org.springframework.http.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.util.Collections;


@Controller
public class RaveController {

    static String movie;

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

    @GetMapping(value = "/logout-success")
    public String GetLogoutPage(Model model){
        return "logout";
    }

    @RequestMapping("/signup")
    public String signup(Model model){
        model.addAttribute("title", "Signup");
        return "signup";
    }

    @RequestMapping("/profile")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String profile(Model model){
        model.addAttribute("title", "Profile");
        return "profile";
    }

    @GetMapping(value = "/dashboard")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String dashboard(Model model){

        model.addAttribute("title", "Dashboard");
        return "dashboard";
    }

    @RequestMapping(value = "/dashboard", method = RequestMethod.POST)
    @PreAuthorize("hasRole('ROLE_USER')")
    public String processDashboard(Model model, @RequestParam String movieName){

       String movie = movieName;



        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();

        headers.set("api_key", "");
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        String resourceURL = "https://api.themoviedb.org/3/search/movie?api_key=<api_key value>&language=en-US&query="+movie+"&page=1&include_adult=true";

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<MovieDetailsSearchResponse> response = restTemplate.exchange(resourceURL, HttpMethod.GET, entity, MovieDetailsSearchResponse.class);

        if (response.getStatusCode() == HttpStatus.OK){

            for (MovieDetails movieDetails : response.getBody().getResults()){
//			for (MovieDetails movieDetails : response.getBody()){

                String movieTitle = movieDetails.title;
//                System.out.println(movieTitle);
//				System.out.println(movieDetails.original_title);
                return movieTitle;
            }

//            System.out.println(response);
        }
        else {
//            System.out.println("Error");
            return "Error";
        }



        model.addAttribute("movieTitle", movieName);
        model.addAttribute("title", "Dashboard");
        return "dashboard:";
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














