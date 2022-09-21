package com.movierental.movierentalapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


import com.movierental.movierentalapi.repository.MovieRepository;
import com.movierental.movierentalapi.models.Movie;;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class MoviesController {

    @Autowired
    private MovieRepository movieRepo;
    
    @GetMapping("/movies")
    public List<Movie> allMovies(){

      System.out.println("Movie List Length");
      return movieRepo.findAll();
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable(value = "id") Long movieId)  {
      Optional<Movie> movieEnt = movieRepo.findById(movieId);
      Movie movie = movieEnt.get();
      return ResponseEntity.ok().body(movie);
    }

    @PostMapping("/movies/new")
    public ResponseEntity<Movie> createNewMovie(@RequestBody Movie newMovie){
      movieRepo.save(newMovie);
      return ResponseEntity.ok().body(newMovie);
    }
}
