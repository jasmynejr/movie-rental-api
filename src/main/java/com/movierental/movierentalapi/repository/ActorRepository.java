package com.movierental.movierentalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.movierental.movierentalapi.models.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor,Long>{
    
}
