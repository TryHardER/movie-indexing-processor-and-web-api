package MockData;/*
 *
 * Created by Khai Stimpson - 2/23/2018
 *
 * */

import com.khaistimpson.movieindexingapi.Helpers.RandomDate;
import com.khaistimpson.movieindexingapi.model.Movie;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

public class MovieMockData {

    public static Stream<Movie> GetMovieMockData(){

//        return  Stream.of(
//                new Movie(UUID.randomUUID().toString(), "test1"),
//                new Movie(UUID.randomUUID().toString(), "test2"),
//                new Movie(UUID.randomUUID().toString(), "test3"),
//                new Movie(UUID.randomUUID().toString(), "test4")
//        );

        List<String> movie_genres = new ArrayList<>();
        movie_genres.add("Romance");
        movie_genres.add("Mystery");
        movie_genres.add("Comdey");
        movie_genres.add("Crime");

        Movie mocv = new Movie("test1", new RandomDate().nextDate(), movie_genres, "");

        System.out.println(mocv.getMovie_title());

        return Stream.of(
                new Movie("test1", new RandomDate().nextDate(), movie_genres, ""),
                new Movie("test2", new RandomDate().nextDate(), movie_genres, ""),
                new Movie("test3", new RandomDate().nextDate(), movie_genres, ""),
                new Movie("test4", new RandomDate().nextDate(), movie_genres, "")
        );


    }

}
