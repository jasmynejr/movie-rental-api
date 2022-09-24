package com.movierental.movierentalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.movierental.movierentalapi.models.Rental;
import java.util.*;

@Repository
public interface RentalRepository extends JpaRepository<Rental,Long> {
    List<Rental> findByCustomerId(long customerId);
    List<Rental> findByStaffId(long staffId);
}
