package com.example.demo.services;


import com.example.demo.MovieDetails;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

public class MovieSearchUtilities {

    public String movieTitle;


    public void run(String... args){
        System.out.println("Yah its working");
        String movie = "catch me if you can";
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();

        headers.set("api_key", "");
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        String resourceURL = "https://api.themoviedb.org/3/search/movie?api_key=92780e608130ce7a60cacc6fb63fdb84&language=en-US&query="+movie+"&page=1&include_adult=true";

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<MovieDetailsSearchResponse> response = restTemplate.exchange(resourceURL, HttpMethod.GET, entity, MovieDetailsSearchResponse.class);

        if (response.getStatusCode() == HttpStatus.OK){

            for (MovieDetails movieDetails : response.getBody().getResults()){
//			for (MovieDetails movieDetails : response.getBody()){

                String movieTitle = movieDetails.title;
                System.out.println(movieTitle);
//				System.out.println(movieDetails.original_title);
            }

            System.out.println(response);
        }
        else {
            System.out.println("Error");
        }

    }




}

