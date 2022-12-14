package com.movierental.movierentalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.movierental.movierentalapi.models.Customer;
import java.util.*;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
    List<Customer> findByStoreId(long storeId);
}
