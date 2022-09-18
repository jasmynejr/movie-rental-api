package com.movierental.movierentalapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movierental.movierentalapi.models.Customer;
import com.movierental.movierentalapi.repository.CustomerRepository;

@RestController
@RequestMapping("/api")
public class CustomersController {
    @Autowired
    private CustomerRepository customerRepo;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerRepo.findAll();
    }

    public ResponseEntity<Customer> findCustomerById(@PathVariable(value="id")Long id){
        Optional<Customer> customerEnt = customerRepo.findById(id);
        Customer customer = customerEnt.get();
        return ResponseEntity.ok().body(customer);
    }
}
