package com.mycompany.demo;

import java.sql.SQLException;

public interface CustomerDAO {
	
	public Customer createCuastomer(String firstName,String lastName,String email) throws SQLException;
	//public Customer displayCuastomer(String firstName,String lastName,String email) throws SQLException;
}