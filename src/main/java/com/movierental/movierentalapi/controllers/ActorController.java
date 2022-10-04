package com.movierental.movierentalapi.controllers;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.movierental.movierentalapi.models.*;
import com.movierental.movierentalapi.repository.*;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class ActorController {
    @Autowired
    private ActorRepository actorRepo;

    @GetMapping("/actors")
    public List<Actor> getAllActors(){
        return actorRepo.findAll();
    }

    @GetMapping("/actors/{id}")
    public ResponseEntity<Actor> getActor(@PathVariable(value="id") Long actorId){
        Optional<Actor> actorEnt = actorRepo.findById(actorId);
        Actor actor = actorEnt.get();

        return ResponseEntity.ok().body(actor);
    }
}
