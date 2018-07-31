package com.example.jpa.controller;

import com.example.jpa.entity.Product;
import com.example.jpa.service.LocalProductService;
import com.example.jpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService localProductService;

    @Autowired
    public ProductController(LocalProductService localProductService) {
        this.localProductService = localProductService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return localProductService.getAllProducts();
    }
}
