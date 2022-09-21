package com.movierental.movierentalapi.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.movierental.movierentalapi.repository.StoreRepository;
import com.movierental.movierentalapi.repository.InventoryRepository;
import com.movierental.movierentalapi.models.Store;
import com.movierental.movierentalapi.models.Inventory;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class StoresController {
    @Autowired
    private StoreRepository storeRepo;
    @Autowired
    private InventoryRepository inventoryRepo;

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

}
