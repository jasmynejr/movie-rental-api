package com.movierental.movierentalapi.models;

import jakarta.persistence.*;


@Entity
@Table(name="staff")
public class Staff {
    private long id;
    private String email;
    private long store_id;
    private boolean active;
    private String username;
    private String password;
    
   
   //private Store store;

    public Staff() {
    }

    public Staff(String email, long store_id, boolean active, String username, String password) {
        this.email = email;
        this.store_id = store_id;
        this.active = active;
        this.username = username;
        this.password = password;
    }

    @Id
    @Column(name="staff_id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name="email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="store_id")
    public long getStore_id() {
        return store_id;
    }

    public void setStore_id(long store_id) {
        this.store_id = store_id;
    }

    @Column(name="active")
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Column(name="username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name="password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    

    
}
