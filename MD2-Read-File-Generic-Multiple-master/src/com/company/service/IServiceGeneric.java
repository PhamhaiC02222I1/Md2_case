package com.company.service;

import java.util.List;

public interface IServiceGeneric<T> {
    List<T> findAll();
    void addUser(T t);
}
