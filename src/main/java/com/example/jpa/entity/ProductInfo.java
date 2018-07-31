package com.example.jpa.entity;

public class ProductInfo {
    private final String name;
    private final int price;
    private final String category;
    private final String brand;

    public ProductInfo(Product product){
        this.name = product.getName();
        this.price = product.getPrice();
        this.category = product.getCategory();
        this.brand = product.getBrand();
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }
}
