package com.khaistimpson.movieindexingapi.controller;

/*
 *
 * Created by Khai Stimpson - 2/14/2018
 *
 * */

import com.khaistimpson.movieindexingapi.model.Movie;
import com.khaistimpson.movieindexingapi.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.Serializable;

@RestController
public class MovieController implements Serializable{

    @Autowired
    Movie movie;

//    @Autowired
//    MovieRepository movie_repo;

    private MovieRepository movie_repo;

    public MovieController(MovieRepository movie_repo){
        this.movie_repo = movie_repo;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Mono<String> get(){

        return Mono.just("<H1> Welcome to the Movie Indexing API </H1>");
    }

    @RequestMapping(value = "/movies/{id}", method = RequestMethod.GET)
    public Mono<Movie> GetMovieByID(@PathVariable final String id){
        return movie_repo.findById(id);
    }

    @RequestMapping(value = "/movies/genre", method = RequestMethod.GET)
    public Flux<Movie> GetMovieByGenre(@RequestParam("genre") final String genre){
        return movie_repo.findAll().filter(movie1 -> movie1.getMovie_genre().contains(genre));
    }

    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public Flux<Movie> getMovies(){
        return movie_repo.findAll();
    }



}
