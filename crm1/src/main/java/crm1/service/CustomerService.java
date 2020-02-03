package crm1.service;

import java.util.List;

import crm1.model.Customer;

public interface CustomerService {
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
}