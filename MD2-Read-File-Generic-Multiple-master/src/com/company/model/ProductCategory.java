package com.company.model;

import java.io.Serializable;

public class ProductCategory implements Serializable {
    private int id;
    private String name;
    private String DesProduct;
    private Product product;

    public ProductCategory() {
    }

    public ProductCategory(int id, String name, String desProduct) {
        this.id = id;
        this.name = name;
        DesProduct = desProduct;
    }

    public ProductCategory(int id, String name, String desProduct, Product product) {
        this.id = id;
        this.name = name;
        DesProduct = desProduct;
        this.product = product;
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

    public String getDesProduct() {
        return DesProduct;
    }

    public void setDesProduct(String desProduct) {
        DesProduct = desProduct;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", DesProduct='" + DesProduct + '\'' +
                 product +"\n";
    }

}
