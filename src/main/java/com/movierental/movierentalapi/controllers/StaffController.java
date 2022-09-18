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

import com.movierental.movierentalapi.repository.StaffRepository;
import com.movierental.movierentalapi.models.Staff;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class StaffController {
    @Autowired
    private StaffRepository staffRepo;

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
}
