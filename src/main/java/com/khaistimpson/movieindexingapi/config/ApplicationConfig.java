package com.khaistimpson.movieindexingapi.config;/*
 *
 * Created by Khai Stimpson - 2/23/2018
 *
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//@Configuration
public class ApplicationConfig{
    private static final String DEFAULT_MOVIE_FOLDER_URI = "C:\\Movies\\";

    private List<String> movie_folders = new ArrayList<>();

    public ApplicationConfig(){
        this.movie_folders.add(DEFAULT_MOVIE_FOLDER_URI);
    }


    public void AddMovieFolder(String folder_path){
        this.movie_folders.add(folder_path);
    }

    public Stream<String> GetMovieFolders(){
        return this.movie_folders.stream();
    }

    public static String GetDefaultURI(){
        return DEFAULT_MOVIE_FOLDER_URI;
    }

}
