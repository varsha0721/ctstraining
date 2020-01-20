package com.mycompany.springjdbcdemo.dao;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.mycompany.springjdbcdemo.model.Customer;
import com.mycompany.springjdbcdemo.model.CustomerRowMapper;

import lombok.Setter;

@Component("dao2")

public class CustomerDaoImplVersion2 implements CustomerDao2
{
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException 
	{
		// TODO Auto-generated method stub
		String sql="insert into customer(uid,first_name,last_name,email) values(?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] {customer.getUid(),customer.getFirstName(),customer.getLastName(),customer.getEmail()});
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException 
	{
		String query="select uid,first_name,last_name,email from customer";
		return jdbcTemplate.query(query, new CustomerRowMapper());
	}
	
	@Override
	public List<Customer> getCustomerById(String uId) throws SQLException {
		String query="select uid,first_name,last_name,email from customer where uid=?";
		return jdbcTemplate.query(query, new Object[] {uId},new CustomerRowMapper());
	}

	@Override
	public int updateCustomerById(Customer customer) throws SQLException {
		System.out.println("abc");
		String sql1="update customer set first_name = ?,last_name =?,email =? where uid=?";
		int i = jdbcTemplate.update(sql1, new Object[] {customer.getFirstName(),customer.getLastName(),customer.getEmail(),customer.getUid()});
		return i;
	
	}

	@Override
	public int deleteCustomer(String uId) throws SQLException {
		String query1="delete from customer where uid=?";
		return jdbcTemplate.update(query1, uId);
}
}