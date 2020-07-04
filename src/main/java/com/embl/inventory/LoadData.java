package com.embl.inventory;

import com.embl.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Hasham Rasheed
 * 05-07-2020
 */
@Configuration
public class LoadData {

    @Autowired
    private InventoryService inventoryService;

    /**
     * Initial method that will load items into the database.
     * @return
     */
    @Bean
    public CommandLineRunner loadInventoryItems() {
        return (args) -> {
            // add items to inventory
            inventoryService.initDatabase();
        };
    }
}
