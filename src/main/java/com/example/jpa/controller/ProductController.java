package com.example.jpa.controller;

import com.example.jpa.entity.Product;
import com.example.jpa.entity.ProductInfo;
import com.example.jpa.service.LocalProductService;
import com.example.jpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/product_list")
    public List<ProductInfo> getProductList(){
        return localProductService.getProductList();
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        localProductService.add(product);
    }

    @PutMapping("/products/{id}")
    public void updateProduct(@PathVariable int id, @RequestBody Product product){
        localProductService.updateById(id, product);
    }

    @GetMapping(name = "/products", params = {"minPrice", "maxPrice"})
    public List<Product> filterProductByPrice(@RequestParam int minPrice, @RequestParam int maxPrice){
        return localProductService.filterByPrice(minPrice, maxPrice);
    }
}
