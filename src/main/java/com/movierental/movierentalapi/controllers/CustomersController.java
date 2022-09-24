package com.movierental.movierentalapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.movierental.movierentalapi.models.*;
import com.movierental.movierentalapi.repository.*;



@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class CustomersController {
    @Autowired
    private CustomerRepository customerRepo;

    @Autowired
    private RentalRepository rentalRepo;

    @Autowired
    private PaymentRepository paymentRepo;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerRepo.findAll();
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> findCustomerById(@PathVariable(value="id")Long id){
        Optional<Customer> customerEnt = customerRepo.findById(id);
        Customer customer = customerEnt.get();
        return ResponseEntity.ok().body(customer);
    }

    @GetMapping("/customers/{id}/rentals")
    public List<Rental> getAllRentals(@PathVariable(value="id") Long customerId){
        return rentalRepo.findByCustomerId(customerId);
    }

    @GetMapping("/customers/{id}/payments")
    public List<Payment> getAllPayments(@PathVariable(value="id") Long customerId){
        return paymentRepo.findByCustomerId(customerId);
    }

}
