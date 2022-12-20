package com.example.thuchanh71.service;

import com.example.thuchanh71.model.Customer;
import com.example.thuchanh71.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomerService implements IGeneralService{
    @Autowired
    private ICustomerRepository customerRepository;
    @Override
    public Iterable findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Object o) {

    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);

    }
}
