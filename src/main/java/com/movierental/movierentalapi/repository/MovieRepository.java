package com.movierental.movierentalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.movierental.movierentalapi.models.Movie;
import java.util.*;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {
    
    List<Movie> findByTitleContaining(String title);
    List<Movie> findByTitleLikeIgnoreCase(String title);
}
