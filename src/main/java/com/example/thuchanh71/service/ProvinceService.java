package com.example.thuchanh71.service;

import com.example.thuchanh71.model.Customer;
import com.example.thuchanh71.model.Province;
import com.example.thuchanh71.repository.ICustomerRepository;
import com.example.thuchanh71.repository.IProvinceRepository;
import com.example.thuchanh71.repository.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProvinceService implements IProvinceService {
    @Autowired
    private IProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Optional<Province> findById(Long id) {
        return provinceRepository.findById(id);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public void remove(Long id) {
        provinceRepository.deleteById(id);
    }
}
