package com.movierental.movierentalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.movierental.movierentalapi.models.Payment;
import java.util.*;
@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long>{
    List<Payment> findByRentalId(long rentalId);
    List<Payment> findByCustomerId(long customerId);
    List<Payment> findByStaffId(long staffId);

    @Query("SELECT SUM(amount) FROM Payment WHERE staffId = ?1")
    float totalSales(long staffId);
}
