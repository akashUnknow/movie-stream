package com.AkashD.movie_stream.controller;

import com.AkashD.movie_stream.model.Movie;
import com.AkashD.movie_stream.repo.MovieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieRepository movieRepository;
    public MovieController(MovieRepository repository){
        this.movieRepository=repository;
    }
    @GetMapping("/getAll")
    public List<Movie> getAll(){
        return movieRepository.findAll();
    }
    @PostMapping("/add")
    public Movie create(@RequestBody Movie movie){
        return movieRepository.save(movie);
    }
}
