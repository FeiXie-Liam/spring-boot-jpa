package com.example.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;
    private String category;
    private String brand;
    private String description;

    @Column(name = "production_date")
    private String productionDate;
    private String origin;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public String getOrigin() {
        return origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
