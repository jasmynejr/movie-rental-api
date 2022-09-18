package com.movierental.movierentalapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movierental.movierentalapi.repository.StaffRepository;
import com.movierental.movierentalapi.models.Staff;

@RestController
@RequestMapping("/api")
public class StaffController {
    @Autowired
    private StaffRepository staffRepo;

    @GetMapping("/staff")
    public List<Staff> allStaff(){
        return staffRepo.findAll();
    }
}
