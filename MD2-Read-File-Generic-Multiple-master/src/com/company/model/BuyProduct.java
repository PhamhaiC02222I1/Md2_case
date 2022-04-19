package com.company.model;

import java.io.Serializable;

public class BuyProduct extends Product implements Serializable {
    private int count;
    private String ngMua;
    private int amount;
    private Product product;


    public BuyProduct(int id, String name, String productFrom, float price, String type, int count, String ngMua, int amount, Product product) {
        super(id, name, productFrom, price, type);
        this.count = count;
        this.ngMua = ngMua;
        this.amount = amount;
        this.product = product;
    }

    public BuyProduct(int count, String ngMua, int amount, Product product) {
        this.count = count;
        this.ngMua = ngMua;
        this.amount = amount;
        this.product = product;
    }

    public BuyProduct(){

    }

    public BuyProduct(int count, Product product, String ngMua, int amount) {
        this.count = count;
        this.product = product;
        this.ngMua = ngMua;
        this.amount = amount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getNgMua() {
        return ngMua;
    }

    public void setNgMua(String ngMua) {
        this.ngMua = ngMua;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

public double total(){
        return this.amount*product.getPrice();
}

    @Override
    public String toString() {
        return "BuyProduct [" +
                "count=" + count +
                ", product=" + product +
                ", ngMua='" + ngMua + '\'' +
                ", amount=" + amount +" ,total: "+total()+
                ']';
    }
}
