package com.example.productsmicroservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ProductController {

    @GetMapping("/products")
    public List<String> getProductsData() {
        return List.of("Product1", "Product2", "Product3");
    }
}
