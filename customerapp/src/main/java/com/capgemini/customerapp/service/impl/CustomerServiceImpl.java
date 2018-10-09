package com.capgemini.customerapp.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.customerapp.entities.Customer;
import com.capgemini.customerapp.exceptions.CustomerAlreadyRegisteredException;
import com.capgemini.customerapp.repository.CustomerRepository;
import com.capgemini.customerapp.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer authenticate(int customerId, String customerPassword) {
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
		return optionalCustomer.get();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(int customerId) {
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
		return optionalCustomer.get();
	}

	@Override
	public void deleteCustomer(int customerId) {
		customerRepository.deleteById(customerId);

	}

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);

	}

}
