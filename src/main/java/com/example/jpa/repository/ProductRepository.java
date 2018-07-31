package com.example.jpa.repository;

import com.example.jpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByPriceGreaterThanAndPriceLessThan(int minPrice, int maxPrice);


}
