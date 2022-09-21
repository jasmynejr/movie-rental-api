package com.movierental.movierentalapi.models;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="rental")
public class Rental {
    private long rentalId;
    private Date rentalDate;
    private long inventoryId;
    private long customerId;
    private Date returnDate;
    private long staffId;

    public Rental() {
    }
    public Rental(Date rentalDate, long inventoryId, long customerId, Date returnDate, long staffId) {
        this.rentalDate = rentalDate;
        this.inventoryId = inventoryId;
        this.customerId = customerId;
        this.returnDate = returnDate;
        this.staffId = staffId;
    }

    @Id
    @Column(name="rental_id")
    public long getRentalId() {
        return rentalId;
    }
    public void setRentalId(long rentalId) {
        this.rentalId = rentalId;
    }

    @Column(name="rental_date")
    public Date getRentalDate() {
        return rentalDate;
    }
    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    @Column(name="inventory_id")
    public long getInventoryId() {
        return inventoryId;
    }
    public void setInventoryId(long inventoryId) {
        this.inventoryId = inventoryId;
    }

    @Column(name="customer_id")
    public long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    @Column(name="return_date")
    public Date getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Column(name="staff_id")
    public long getStaffId() {
        return staffId;
    }
    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    
    
}
