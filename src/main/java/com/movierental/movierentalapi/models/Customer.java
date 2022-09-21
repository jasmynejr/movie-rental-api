package com.movierental.movierentalapi.models;

import jakarta.persistence.*;

@Entity
@Table(name="customer")
public class Customer {
    private long id;
    private long storeId;
    private String firstName;
    private String lastName;
    private String email;
    private boolean active;

    private Address address;
    
    public Customer() {
    }
   
    public Customer(long storeId, String firstName, String lastName, String email, boolean active) {
        this.storeId = storeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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
    public long getStoreId() {
        return storeId;
    }

    public void setStoreId(long storeId) {
        this.storeId = storeId;
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

    @Column(name="email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="active")
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @OneToOne
    @JoinColumn(name="address_id",insertable = false,updatable = false)
    public Address getAddress(){
        return address;
    }

    public void setAddress(Address a){
        this.address  = a;
    }
    
}
