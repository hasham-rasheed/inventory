package com.embl.inventory.util;

import com.embl.inventory.model.ItemModel;

import java.util.Random;
import java.util.UUID;

/**
 * @author Hasham Rasheed
 * 02-07-2020
 * Generates Stock Keeping Unit (SKU) based on items's name and count.
 */
public class SkuGenerator {

    /**
     * Generates SKU using item name and count. Also tries to randomize it by
     * appending random character from name at the end of generated SKU.
     * @param itemModel
     * @return Generated SKU String
     */
    public static String generateSku(final ItemModel itemModel) {
        if (itemModel == null) {
            return UUID.randomUUID().toString();
        }
        final String[] nameParts = itemModel.getName().split(" ");
        final StringBuilder sb = new StringBuilder();
        final Random random = new Random();
        for (final String part : nameParts) {
            sb.append(part.charAt(0));
        }
        sb.append("-");
        int randCharIndex = itemModel.getName().length() - 1;
        char randChar = itemModel.getName().charAt(random.nextInt(randCharIndex));
        if(randChar == ' ') {
            randCharIndex++;
            randChar = itemModel.getName().charAt(random.nextInt(randCharIndex));
        }
        sb.append(randChar);
        sb.append(itemModel.getCount());
        return sb.toString().toUpperCase();
    }

}
