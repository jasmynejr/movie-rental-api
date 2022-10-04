package com.movierental.movierentalapi.models;

import jakarta.persistence.*;
import java.util.*;
@Entity
@Table(name="actor")
public class Actor {
    private long id;
    private String firstName;
    private String lastName;
    private List<Movie> movies;
    public Actor() {}

    public Actor(String first_name, String last_name) {
        this.firstName = first_name;
        this.lastName = last_name;
    }

    @Id
    @Column(name="actor_id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name="first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name="last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @ManyToMany
    @JoinTable(name="film_actor", joinColumns = @JoinColumn(name="actor_id"), inverseJoinColumns = @JoinColumn(name="film_id"))
    public List<Movie> getActorMovies(){
        return movies;
    }

    public void setActorMovies(List<Movie> movies){
        this.movies = movies;
    }
      
    
}
