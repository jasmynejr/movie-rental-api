package com.movierental.movierentalapi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
    private long id;
    private long store_id;
    private String first_name;
    private String last_name;
    private String email;
    private long address_id;
    private boolean active;

    
    public Customer() {
    }
    public Customer(long store_id, String first_name, String last_name, String email, long address_id, boolean active) {
        this.store_id = store_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.address_id = address_id;
        this.active = active;
    }
    @Id
    @Column(name="customer_id")
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    @Column(name="store_id")
    public long getStore_id() {
        return store_id;
    }
    public void setStore_id(long store_id) {
        this.store_id = store_id;
    }

    @Column(name="first_name")
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    @Column(name="last_name")   
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Column(name="email")
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="address_id")
    public long getAddress_id() {
        return address_id;
    }
    public void setAddress_id(long address_id) {
        this.address_id = address_id;
    }

    @Column(name="activebool")
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    
}