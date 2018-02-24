package com.khaistimpson.movieindexingapi;

import MockData.MovieMockData;
import com.khaistimpson.movieindexingapi.repository.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MovieIndexingApiApplication {

	@Bean
	CommandLineRunner movies(MovieRepository movie_repo){
		return args -> {
			movie_repo
					.deleteAll()
					.subscribe(null, null, () ->{

						MovieMockData
								.GetMovieMockData()
								.forEach(movie -> movie_repo
                                .save(movie)
                                .subscribe(System.out::println));

					});

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieIndexingApiApplication.class, args);
	}

}
