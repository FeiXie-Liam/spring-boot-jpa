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
}
