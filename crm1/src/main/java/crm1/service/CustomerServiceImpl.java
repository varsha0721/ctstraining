package crm1.service;

import java.util.List;

import crm1.dao.CustomerDAO;
import crm1.dao.CustomerDAOImpl;
import crm1.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO dao;
	{
		dao=new CustomerDAOImpl();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		
		return dao.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}

}