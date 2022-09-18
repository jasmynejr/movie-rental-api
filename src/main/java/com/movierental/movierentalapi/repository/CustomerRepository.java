package com.movierental.movierentalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.movierental.movierentalapi.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
    
}
