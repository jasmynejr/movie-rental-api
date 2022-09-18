package com.movierental.movierentalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.movierental.movierentalapi.models.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff,Long>{
    
}
