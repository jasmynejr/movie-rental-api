package com.movierental.movierentalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.movierental.movierentalapi.models.Inventory;
import java.util.*;
@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Long>{
    List<Inventory> findByStoreId(long store_id);
}
