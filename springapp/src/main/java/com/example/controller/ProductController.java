package com.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.*;
import com.exa

@RestController
@RequestMapping("/products")
public class ProductController {

    private final Map<Long, Product> productMap = new HashMap<>();
    private long currentId = 1;

    // Retrieve product details by ID
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = productMap.get(id);
        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Create a new product
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product newProduct) {
        if (newProduct.getId() != null) {
            return ResponseEntity.badRequest().build();
        }

        newProduct.setId(currentId++);
        productMap.put(newProduct.getId(), newProduct);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProduct);
    }
}
