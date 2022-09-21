package com.movierental.movierentalapi.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.movierental.movierentalapi.repository.*;
import com.movierental.movierentalapi.models.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class StoresController {
    @Autowired
    private StoreRepository storeRepo;
    @Autowired
    private InventoryRepository inventoryRepo;
    @Autowired
    private CustomerRepository customerRepo;
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

    @PostMapping("/stores/new")
    public ResponseEntity<String> createStore(@RequestBody String newStore){
        return ResponseEntity.ok().body(newStore);
    }

    @GetMapping("/stores/{id}/inventory")
    public List<Inventory> findStoreInventory(@PathVariable(value = "id") long storeId){
        return inventoryRepo.findByStoreId(storeId);
    }

    @GetMapping("/stores/{id}/customers")
    public List<Customer> findStoreCustomers(@PathVariable(value="id") long storeId){
        return customerRepo.findByStoreId(storeId);
    }
}
