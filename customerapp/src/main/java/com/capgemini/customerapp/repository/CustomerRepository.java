package com.capgemini.customerapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.customerapp.entities.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {

}
