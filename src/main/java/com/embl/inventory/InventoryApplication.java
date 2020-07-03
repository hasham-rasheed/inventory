package com.embl.inventory;

import com.embl.inventory.mapper.ItemMapper;
import com.embl.inventory.model.ItemModel;
import com.embl.inventory.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import java.util.Random;

@Configuration
@SpringBootApplication(scanBasePackages = "com.embl")
@EnableTransactionManagement
@EnableJpaRepositories
public class InventoryApplication {

    // Setting inventory items limit just for fun.
    private final static int LIMIT = 500;

    public static void main(String[] args) {
        SpringApplication.run(InventoryApplication.class, args);
    }

    /**
     * Initial method that will load items into the database.
     * @param inventoryRepository
     * @return
     */
    @Bean
    public CommandLineRunner loadInventoryItems(InventoryRepository inventoryRepository) {
        return (args) -> {
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

        };
    }

}
