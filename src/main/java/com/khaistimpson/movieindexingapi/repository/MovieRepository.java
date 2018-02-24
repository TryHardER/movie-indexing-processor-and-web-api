package com.khaistimpson.movieindexingapi.repository;/*
 *
 * Created by Khai Stimpson - 2/14/2018
 *
 * */

import com.khaistimpson.movieindexingapi.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;


public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {

}
