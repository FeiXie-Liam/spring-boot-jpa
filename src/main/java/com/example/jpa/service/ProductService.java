package com.example.jpa.service;


import com.example.jpa.entity.Product;
import com.example.jpa.entity.ProductInfo;

import java.util.List;

public interface ProductService {

    void add(Product product);

    List<Product> getAllProducts();

    List<ProductInfo> getProductList();

    void deleteById(int id);

    void updateById(int id, Product product);

    List<Product> filterByPrice(int minPrice, int maxPrice);

}
