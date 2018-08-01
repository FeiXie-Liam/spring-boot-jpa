package com.example.jpa.service;

import com.example.jpa.entity.Product;
import com.example.jpa.entity.ProductInfo;
import com.example.jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public List<ProductInfo> getProductList() {
        List<Product> allProducts = productRepository.findAll();
        List<ProductInfo> productList = new ArrayList<>();
        allProducts.forEach(product -> productList.add(new ProductInfo(product)));
        return productList;
    }

    @Override
    public void deleteById(int id){

    }

    @Override
    public void updateById(int id, Product product){
        Optional<Product> updatingProduct = productRepository.findById(id);
        if(updatingProduct.isPresent()){
            updatingProduct.get().setBrand(product.getBrand());
            updatingProduct.get().setCategory(product.getCategory());
            updatingProduct.get().setDescription(product.getDescription());
            updatingProduct.get().setName(product.getName());
            updatingProduct.get().setOrigin(product.getOrigin());
            updatingProduct.get().setPrice(product.getPrice());
            updatingProduct.get().setProductionDate(product.getProductionDate());

            productRepository.save(updatingProduct.get());
        }
    }



    @Override
    public List<Product> filterByPrice(int minPrice, int maxPrice){
        return productRepository.findByPriceGreaterThanAndPriceLessThan(minPrice, maxPrice);
    }

    @Override
    public List<Product> filterByBrand(String brand){
        return productRepository.findByBrandIs(brand);
    }

    @Override
    public List<Product> filterByCategory(String category){
        return productRepository.findByCategoryIs(category);
    }

    @Override
    public Page<Product> getAllPagedProducts(){
        return productRepository.findAll(PageRequest.of(0, 3));
    }

    @Override
    public List<Product> getAllSortedProducts(boolean desc){
        if(desc){
            return productRepository.findAll(new Sort(Sort.Direction.DESC, "price"));
        }
        else{
            return productRepository.findAll(new Sort(Sort.Direction.ASC, "price"));
        }
    }
}
