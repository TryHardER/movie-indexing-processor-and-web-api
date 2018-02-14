package com.khaistimpson.movieindexingapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.Date;
import java.util.List;

/*
*
* Created by Khai Stimpson - 14/02/2018
*
* */

@Document(collection = "movies")
@Data
@Component
public class Movie {

    @Id
    private long ID;

    private String movie_title;
    private Date movie_release_date;
    private URI movie_uri;
    private List<String> movie_genre;

}
