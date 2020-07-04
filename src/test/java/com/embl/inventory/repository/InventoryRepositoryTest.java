package com.embl.inventory.repository;

import com.embl.inventory.entity.ItemEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Hasham Rasheed
 * 03-07-2020
 */
@SpringBootTest
public class InventoryRepositoryTest {

    @Autowired
    private InventoryRepository inventoryRepository;


    @Test
    public void testFindAll(){
        List<ItemEntity> itemEntities = this.inventoryRepository.findAll();
        assertNotNull(itemEntities);
        assertEquals(itemEntities.size(), 10);
    }

    @Test
    public void testSave() {
        final ItemEntity item = new ItemEntity();
        item.setName("Spring Data JPA");
        item.setCount(10);
        item.setSku("SDJ-J10");
        final ItemEntity savedItem = inventoryRepository.save(item);
        assertEquals(savedItem, item);
        assertEquals(savedItem.getName(), item.getName());
        assertEquals(savedItem.getCount(), item.getCount());
        assertEquals(savedItem.getSku(), item.getSku());
    }

    @Test
    public void testDelete() {
        final Optional<ItemEntity> foundEntityOpt =
                inventoryRepository.findById(1L);
        if(foundEntityOpt.isPresent()) {
            inventoryRepository.deleteById(1L);
            assertFalse(inventoryRepository.findById(1L).isPresent());
        }
    }

}
