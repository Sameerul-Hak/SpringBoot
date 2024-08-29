package com.Ecommerce.Ecommerce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServices {
    
    @Autowired
    private ProductRepository productRepository;
    public List<Product> getAllProducts() {
        for(Product product : productRepository.findAll()) {
            System.out.println(product);
        }
        return productRepository.findAll();
    }
}
