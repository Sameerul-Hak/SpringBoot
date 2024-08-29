package com.Ecommerce.Ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServices productServices;

    @RequestMapping(path = "/allproducts", method = RequestMethod.GET)
    public List<Product> getAllProducts() {
        return productServices.getAllProducts();
    }
}
