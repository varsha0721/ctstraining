package com.mycompany.demo;

import java.sql.SQLException;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO dao;
	{
		dao=new CustomerDAOImpl();
	}

	@Override
	public Customer createCuastomer(String firstName, String lastName, String email) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createCuastomer(firstName, lastName, email);
	}

}