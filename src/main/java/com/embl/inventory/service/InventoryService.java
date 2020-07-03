package com.embl.inventory.service;

import com.embl.inventory.model.ItemModel;
import java.util.List;

/**
 * @author Hasham Rasheed
 * 02-07-2020
 *
 * Inventory Service provides utility methods to interact with repository
 * layer.
 */
public interface InventoryService {

    /**
     * Gets all items from the in-memory database
     * @return List of items found
     */
    List<ItemModel> findAll();

}
