package com.embl.inventory.service.impl;

import com.embl.inventory.mapper.ItemMapper;
import com.embl.inventory.model.ItemModel;
import com.embl.inventory.repository.InventoryRepository;
import com.embl.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Random;

/**
 * @author Hasham Rasheed
 * 02-07-2020
 * {@inheritDoc}
 */
@Component
@Transactional
public class InventoryServiceImpl implements InventoryService {

    // Setting inventory items limit just for fun.
    private final static int LIMIT = 500;

    @Autowired
    private InventoryRepository inventoryRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ItemModel> findAll() {
        return ItemMapper.INSTANCE.toModelList(inventoryRepository.findAll());
    }

    /**
     * {@inheritDoc}
     */
    public void initDatabase() {
        final Random random = new Random();
        // add items to inventory
        inventoryRepository.save(ItemMapper.INSTANCE.toEntity(
                new ItemModel("Continuous Delivery",
                        random.nextInt(LIMIT))));
        inventoryRepository.save(ItemMapper.INSTANCE.toEntity(
                new ItemModel("Algorithms",
                        random.nextInt(LIMIT))));
        inventoryRepository.save(ItemMapper.INSTANCE.toEntity(
                new ItemModel("Cracking The Coding Interview",
                        random.nextInt(LIMIT))));
        inventoryRepository.save(ItemMapper.INSTANCE.toEntity(
                new ItemModel("The Clean Coder",
                        random.nextInt(LIMIT))));
        inventoryRepository.save(ItemMapper.INSTANCE.toEntity(
                new ItemModel("Head First Design Patterns",
                        random.nextInt(LIMIT))));
        inventoryRepository.save(ItemMapper.INSTANCE.toEntity(
                new ItemModel("Refactoring",
                        random.nextInt(LIMIT))));
        inventoryRepository.save(ItemMapper.INSTANCE.toEntity(
                new ItemModel("Code Complete",
                        random.nextInt(LIMIT))));
        inventoryRepository.save(ItemMapper.INSTANCE.toEntity(
                new ItemModel("The Pragmatic Programmer",
                        random.nextInt(LIMIT))));
        inventoryRepository.save(ItemMapper.INSTANCE.toEntity(
                new ItemModel("Patterns of Enterprise Application " +
                        "Architecture",
                        random.nextInt(LIMIT))));
        inventoryRepository.save(ItemMapper.INSTANCE.toEntity(
                new ItemModel("Clean Code",
                        random.nextInt(LIMIT))));
    }

}
