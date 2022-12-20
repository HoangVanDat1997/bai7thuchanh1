package com.example.thuchanh71.service;

import com.example.thuchanh71.model.Customer;

import java.util.Optional;

public interface IGeneralService <T>{
    Iterable<T> findAll();
    Optional<T> findById(Long id);
    void save(T t);
    void save(Customer customer);

    void remove(Long id);
}
