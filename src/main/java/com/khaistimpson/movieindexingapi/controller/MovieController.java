package com.khaistimpson.movieindexingapi.controller;

/*
 *
 * Created by Khai Stimpson - 2/14/2018
 *
 * */

import com.khaistimpson.movieindexingapi.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    Movie movie;

    //Need to cache this...
    List<Movie> movies;



}