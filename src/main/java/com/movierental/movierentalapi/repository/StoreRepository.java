package com.movierental.movierentalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.movierental.movierentalapi.models.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store,Long>{
    
}
