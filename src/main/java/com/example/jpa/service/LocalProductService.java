package com.example.jpa.service;

import com.example.jpa.entity.Product;
import com.example.jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalProductService implements ProductService{

    private final
    ProductRepository productRepository;

    @Autowired
    public LocalProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void add(Product product){
        productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @Override
    public void deleteById(int id){

    }

    @Override
    public void modifyById(int id){

    }

    @Override
    public void filterByOrigin(String origin){

    }
}
