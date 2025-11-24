package com.example.demo.dao;

import com.example.demo.model.Customer;

import java.util.List;

public interface CustomerDao {

    void add(Customer customer);

    Customer findById(Long id);

    void update(Customer customer);

    void delete(Long id);

    List<Customer> findAll();
}
