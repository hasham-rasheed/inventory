package com.embl.inventory.model;

import com.embl.inventory.generator.SkuGenerator;
import lombok.Data;

/**
 * @author Hasham Rasheed
 * 02-07-2020
 * Item POJO to be used between service / repository layers.
 */
@Data
public class ItemModel {

    private Long id;
    private String sku;
    private String name;
    private int count;

    public ItemModel(){}

    public ItemModel(final String name,
                     final int count) {
        this.name = name;
        this.count = count;
        this.sku = SkuGenerator.generateSku(this);
    }

}
