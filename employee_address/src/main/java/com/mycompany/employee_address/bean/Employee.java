package com.mycompany.employee_address.bean;

public class Employee 
{
	//public String getEmployeeDetails();
	//public String getEmployeeAddress();
	private String employeeid;
	private String firstName;
	private String lastName;
	private Address address;
	
	@Override
	public String toString() 
	{
		return "Employee [employeeid=" + employeeid + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + "]";
	}

	public Employee(String employeeid, String firstName, String lastName, Address address) 
	{
		super();
		this.employeeid = employeeid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
}
