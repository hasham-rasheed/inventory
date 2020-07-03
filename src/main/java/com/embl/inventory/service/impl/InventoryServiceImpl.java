package com.embl.inventory.service.impl;

import com.embl.inventory.mapper.ItemMapper;
import com.embl.inventory.model.ItemModel;
import com.embl.inventory.repository.InventoryRepository;
import com.embl.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Hasham Rasheed
 * 02-07-2020
 * {@inheritDoc}
 */
@Component
@Transactional
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ItemModel> findAll() {
        return ItemMapper.INSTANCE.toModelList(inventoryRepository.findAll());
    }
}
