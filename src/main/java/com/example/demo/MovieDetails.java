package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;



import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieDetails {

//  @JsonProperty("vote_count");
    public Long vote_count;

//    @JsonProperty("id");
    public   Long id;

//    @JsonProperty("video");
    public boolean video;

//    @JsonProperty("vote_average");
    public float vote_average;

//    @JsonProperty("title")
    public String title;

//    @JsonProperty("popularity");
    public float popularity;

//    @JsonProperty("poster_path");
    public String poster_path;

//    @JsonProperty("original_language");
    public String original_language;

//    @JsonProperty("original_title");
    public String original_title;

//    @JsonProperty("genre_ids");
    public ArrayList genre_ids = new ArrayList();

    public String overview;

    public MovieDetails() {
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Long getVote_count() {
        return vote_count;
    }

    public void setVote_count(Long vote_count) {
        this.vote_count = vote_count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public float getVote_average() {
        return vote_average;
    }

    public void setVote_average(float vote_average) {
        this.vote_average = vote_average;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public ArrayList getGenre_ids() {
        return genre_ids;
    }

    public void setGenre_ids(ArrayList genre_ids) {
        this.genre_ids = genre_ids;
    }
}



