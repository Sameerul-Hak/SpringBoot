package com.Ecommerce.Ecommerce;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String ...args) throws Exception
    {
        // CHECK IF THE TABLE IS EMPTY OR NOT
        if(productRepository.count() == 0) 
        {
            List<Product> products = Arrays.asList(
                new Product("Product 1", "Description 1", 10.0, 100, 5, "Category 1", "Seller 1", 10),
                new Product("Product 2", "Description 2", 20.0, 200, 4, "Category 2", "Seller 2", 20),
                new Product("Product 3", "Description 3", 30.0, 300, 3, "Category 3", "Seller 3", 30),
                new Product("Product 4", "Description 4", 40.0, 400, 2, "Category 4", "Seller 4", 40),
                new Product("Product 5", "Description 5", 50.0, 500, 1, "Category 5", "Seller 5", 50)
            );

            productRepository.saveAll(products);
            System.out.println("Data seeded successfully");	
        }
    }
}
