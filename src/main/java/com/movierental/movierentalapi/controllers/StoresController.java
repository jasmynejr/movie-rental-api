package com.movierental.movierentalapi.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movierental.movierentalapi.repository.StoreRepository;
import com.movierental.movierentalapi.models.Store;

@RestController
@RequestMapping("/api")
public class StoresController {
    @Autowired
    private StoreRepository storeRepo;

    @GetMapping("/stores")
    public List<Store> allStores(){
        return storeRepo.findAll();
    }

    @GetMapping("/stores/{id}")
    public ResponseEntity<Store> getStoreById(@PathVariable(value = "id") long storeId){
        Optional<Store> storeEnt = storeRepo.findById(storeId);
        Store store = storeEnt.get();
        return ResponseEntity.ok().body(store);
    }
}
