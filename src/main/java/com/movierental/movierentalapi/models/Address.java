package com.movierental.movierentalapi.models;


import jakarta.persistence.*;

@Entity
@Table(name="address")
public class Address {
    private long id;
    private String address;
    private String district;
    private long city_id;
    private String postal_code;
    private String phone_number;
    
    public Address() {
    }

    public Address(String address, String district, long city_id, String postal_code, String phone_number) {
        this.address = address;
        this.district = district;
        this.city_id = city_id;
        this.postal_code = postal_code;
        this.phone_number = phone_number;
    }

    @Id
    @Column(name="address_id")
    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    @Column(name="address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name="district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Column(name="city_id")
    public long getCity_id() {
        return city_id;
    }

    public void setCity_id(long city_id) {
        this.city_id = city_id;
    }

    @Column(name="postal_code")
    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    @Column(name="phone")
    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    
}
