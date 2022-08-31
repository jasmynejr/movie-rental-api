package com.movierental.movierentalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.movierental.movierentalapi.models.Movie;


@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {
    
}
