package com.movierental.movierentalapi.models;

import jakarta.persistence.*;

@Entity
@Table(name="inventory")
public class Inventory {
    private long inventoryId;
    private long filmId;
    private long storeId;

    private Movie film;
    public Inventory(){

    }

    public Inventory(long filmId, long storeId) {
        this.filmId = filmId;
        this.storeId = storeId;
    }

    @Id
    @Column(name="inventory_id")
    public long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(long inventoryId) {
        this.inventoryId = inventoryId;
    }


    @Column(name="film_id")
    public long getFilmId() {
        return filmId;
    }

    public void setFilmId(long filmId) {
        this.filmId = filmId;
    }

    @Column(name="store_id")
    public long getStoreId() {
        return storeId;
    }

    
    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }

    @OneToOne
    @JoinColumn(name="film_id",insertable = false,updatable = false)
    public Movie getFilm(){
        return film;
    }

    public void setFilm(Movie film){
        this.film = film;
    }
    

    
    
    
}
