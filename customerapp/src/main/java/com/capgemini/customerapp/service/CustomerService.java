package com.capgemini.customerapp.service;

import com.capgemini.customerapp.entities.Customer;
import com.capgemini.customerapp.exceptions.CustomerAlreadyRegisteredException;

public interface CustomerService {
	public Customer addCustomer(Customer customer) throws CustomerAlreadyRegisteredException;

	public Customer authenticate(int customerId, String customerPassword);

	public Customer updateCustomer(Customer customer);

	public Customer getCustomerById(int customerId);

	public void deleteCustomer(int customerId);

}
