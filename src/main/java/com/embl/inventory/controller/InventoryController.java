package com.embl.inventory.controller;

import com.embl.inventory.model.ItemModel;
import com.embl.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author Hasham Rasheed
 * 02-07-2020
 * Controller that exposes CRUD APIs to the front-end.
 */

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    /**
     * Exposes an endpoint to get all items from the in-memory database
     * @return List of items found
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    private List<ItemModel> findAll() {
        return inventoryService.findAll();
    }

}
