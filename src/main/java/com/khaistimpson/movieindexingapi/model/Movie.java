package com.khaistimpson.movieindexingapi.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.khaistimpson.movieindexingapi.config.ApplicationConfig;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/*
*
* Created by Khai Stimpson - 14/02/2018
*
* */

@Document(collection = "movies")
@Component
public class Movie implements Serializable{

    @Id @Getter
    private String id;

    @Indexed @Getter @Setter private String movie_title;
    @Indexed @Getter @Setter private LocalDate movie_release_date;
    @Indexed @Getter @Setter private String movie_uri;
    @Indexed @Getter @Setter private List<String> movie_genre;


    public Movie(){

    }

    public Movie(String title, LocalDate movie_release_date, List<String> movie_genres, String uri){
        this.movie_title = title;
        this.movie_release_date = movie_release_date;
        this.movie_genre = movie_genres;

        //TODO: add the movie file extension to the uri to make it a file...
        if(uri.isEmpty()){
            this.movie_uri = ApplicationConfig.GetDefaultURI() + movie_title;
        }else{
            this.movie_uri = uri + movie_title;
        }
    }

    @Override
    public String toString() {

        GsonBuilder gson_builder = new GsonBuilder();
        gson_builder.setPrettyPrinting();
        Gson gson = gson_builder.create();
        return gson.toJson(this);


    }

}
