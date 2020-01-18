package com.mycompany.springjdbcdemo.dao;

import java.sql.SQLException;
import java.util.List;

import com.mycompany.springjdbcdemo.model.Customer;

public interface CustomerDao
{

	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> showCustomer() throws SQLException;
}