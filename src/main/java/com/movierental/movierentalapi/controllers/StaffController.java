package com.movierental.movierentalapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.movierental.movierentalapi.repository.*;
import com.movierental.movierentalapi.models.*;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class StaffController {
    @Autowired
    private StaffRepository staffRepo;

    @Autowired
    private PaymentRepository paymentRepo;
    @GetMapping("/staff")
    public List<Staff> allStaff(){
        return staffRepo.findAll();
    }

    @GetMapping("/staff/{id}")
    public ResponseEntity<Staff> getStaffById(@PathVariable(value = "id")Long id){
        Optional<Staff> staffEnt = staffRepo.findById(id);
        Staff staff = staffEnt.get();
        return ResponseEntity.ok().body(staff);

    }

    @GetMapping("/staff/{id}/total-sales")
    public ResponseEntity<Float> getSales(@PathVariable(value = "id")Long id){
        float val = paymentRepo.totalSales(id);
        return ResponseEntity.ok().body(val);

    }
}
