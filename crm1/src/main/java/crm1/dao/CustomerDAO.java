package crm1.dao;

import java.util.List;

import crm1.model.Customer;

public interface CustomerDAO {

	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
}