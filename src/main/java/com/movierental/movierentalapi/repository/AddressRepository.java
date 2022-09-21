package com.movierental.movierentalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.movierental.movierentalapi.models.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
    
}
