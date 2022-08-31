package com.movierental.movierentalapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movierental.movierentalapi.repository.MovieRepository;
import com.movierental.movierentalapi.models.Movie;;
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
}
