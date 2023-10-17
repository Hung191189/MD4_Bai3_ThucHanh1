package com.example.md4_bai3_thuchanh1.service;

import com.example.md4_bai3_thuchanh1.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
