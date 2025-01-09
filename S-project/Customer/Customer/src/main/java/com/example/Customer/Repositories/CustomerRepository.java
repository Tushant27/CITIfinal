package com.example.Customer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Customer.pojo.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
