package com.mycompany.springjdbcdemo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.springjdbcdemo.model.Customer;
@Component("dao")
public class CustomerDaoImpl implements CustomerDao {
	private DataSource dataSource;
	private Connection connection;
	private PreparedStatement pStatement;
private static Logger logger=Logger.getLogger("com.mycompany.springjdbcdemo.dao.CustomerDaoImpl");
	@Autowired
	public CustomerDaoImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}
@PostConstruct
public void init()
{
	try {
		logger.info("creating connection");
		connection=dataSource.getConnection();
		logger.info("connection established.");
	} catch (SQLException e) {
		
		e.printStackTrace();
		logger.info("connection unsuccesfull.");
	}
}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		pStatement=connection.prepareStatement("insert into customer(uid,first_name,last_name,email) values(?,?,?,?)");
		pStatement.setString(1, customer.getUid());
		pStatement.setString(2, customer.getFirstName());
		pStatement.setString(3, customer.getLastName());
		pStatement.setString(4, customer.getEmail());
		pStatement.executeUpdate();
		return customer;
	}
	
	@Override
	public List<Customer> showCustomer() throws SQLException {
		Statement st=connection.createStatement();
		
		ResultSet rSet=st.executeQuery("select uid,first_name,last_name,email from customer");
		List<Customer> list=new ArrayList<Customer>();
		while(rSet.next())
		{
			Customer customer1=new Customer(rSet.getString("uid"),
					rSet.getString("first_name"), rSet.getString("last_name"), 
					rSet.getString("email"));
			list.add(customer1);
		}
		return list;	
	}

}