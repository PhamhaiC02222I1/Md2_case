package com.company.service;

import com.company.model.*;

import java.util.List;

public interface IGenericService<T> {
    List<T> findAll();
    void save(T t);

    T findById(int id);
    void deleteById(int id);
    void editById(ProductCategory productCategory);
    void editById(Product product);
    void sortByName();
    void sortByPrice();
    T findProductByName(String name);

}
