package com.movierental.movierentalapi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="store")
public class Store {
    private long id;
    private long manager_id;
    private long address_id;

    public Store(){}

    public Store(long manager_id, long address_id) {
        this.manager_id = manager_id;
        this.address_id = address_id;
    }

    @Id
    @Column(name="store_id")
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }

    @Column(name="manager_staff_id")
    public long getStoreManagerId(){
        return manager_id;
    }

    /**
     * @param id
     */
    public void setStoreManagerId(long id){
        this.manager_id = id;
    }

    @Column(name="address_id")
    public long getStoreAddressId(){
        return address_id;
    }

    public void setStoreAddressId(long id){
        this.address_id = id;
    }

    @Override
    public String toString(){
        return "Store #"+id;
    }
}
