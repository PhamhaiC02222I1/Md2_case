package com.company.controller;

import com.company.model.ProductCategory;
import com.company.service.ProductCategory.ProductCategoryServiceIMPL;

import java.util.List;

public class ProductCategoryControler {
    ProductCategoryServiceIMPL productCategoryServiceIMPL=new ProductCategoryServiceIMPL();
    public List<ProductCategory> showListProductCategory(){
        return productCategoryServiceIMPL.findAll();
    }
    public void creatProductCategory(ProductCategory productCategory){
        productCategoryServiceIMPL.save(productCategory);
    }
    public ProductCategory findById(int id){
        return productCategoryServiceIMPL.findById(id);
    }
    public void delteteByID(int id){
        productCategoryServiceIMPL.deleteById(id);
    }
    public ProductCategory findByCatarogyname(String name){
      return productCategoryServiceIMPL.findByCatarogyName(name);
    }
    public void editById(ProductCategory productCategory){
        productCategoryServiceIMPL.editById(productCategory);
    }
}
