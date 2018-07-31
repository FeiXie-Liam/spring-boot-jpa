package com.example.jpa.service;


import com.example.jpa.entity.Product;
import com.example.jpa.entity.ProductInfo;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    void add(Product product);

    List<Product> getAllProducts();

    List<ProductInfo> getProductList();

    void deleteById(int id);

    void updateById(int id, Product product);

    List<Product> filterByPrice(int minPrice, int maxPrice);

    List<Product> filterByBrand(String brand);

    List<Product> filterByCategory(String category);

    Page<Product> getAllPagedProducts();

    List<Product> getAllSortedProducts(boolean desc);
}
