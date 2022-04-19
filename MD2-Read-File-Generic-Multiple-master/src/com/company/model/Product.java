package com.company.model;

import java.io.Serializable;

public class Product implements Serializable {
    private  int id;
    private String name;
    private String  ProductFrom;
    private float price;
    private String type;



    public Product(int id, String name, String productFrom, float price, String type) {
        this.id = id;
        this.name = name;
        ProductFrom = productFrom;
        this.price = price;
        this.type = type;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductFrom() {
        return ProductFrom;
    }

    public void setProductFrom(String productFrom) {
        ProductFrom = productFrom;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ProductFrom='" + ProductFrom + '\'' +
                ", price=" + price +
                ", type=" + type + "\n";
    }
}
