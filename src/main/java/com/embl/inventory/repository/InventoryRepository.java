package com.embl.inventory.repository;

import com.embl.inventory.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Hasham Rasheed
 * 02-07-2020
 * Repository layer responsible for interacting with in-memory database to
 * perform CRUD operations.
 */
@Repository
public interface InventoryRepository extends CrudRepository<ItemEntity, Long> {

    /**
     * Retrieve operation to get all items from the in-memory database
     * @return List of items found
     */
    List<ItemEntity> findAll();

}
