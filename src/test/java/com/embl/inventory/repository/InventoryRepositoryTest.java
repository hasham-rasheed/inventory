package com.embl.inventory.repository;

import com.embl.inventory.entity.ItemEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Hasham Rasheed
 * 03-07-2020
 */
@ExtendWith(SpringExtension.class)
@DataJpaTest
public class InventoryRepositoryTest {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Test
    public void testFindAll(){
        List<ItemEntity> itemEntities = this.inventoryRepository.findAll();
        assertNotNull(itemEntities);
        assertEquals(itemEntities.size(), 10);
    }

}
