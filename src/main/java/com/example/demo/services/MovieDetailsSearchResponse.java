package com.example.demo.services;

import com.example.demo.MovieDetails;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieDetailsSearchResponse {
    @JsonProperty("page")
    private int page;

    @JsonProperty("results")
    private MovieDetails[] results;

    @JsonProperty("total_results")
    private int total_results;

    @JsonProperty("total_pages")
    private int total_pages;

    public MovieDetails[] getResults() {
        return results;
    }


}
