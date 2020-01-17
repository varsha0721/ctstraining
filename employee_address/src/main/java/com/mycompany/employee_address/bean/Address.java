package com.mycompany.employee_address.bean;

public class Address
{
	//public String getEmployeeAddress();
	private String addressLine1;
	private String addressLine2;
	private String phoneNumber;
	private String zipCode;
	

	@Override
	public String toString() 
	{
		return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", phoneNumber="
				+ phoneNumber + ", zipCode=" + zipCode + "]";
	}


	public Address(String addressLine1, String addressLine2, String phoneNumber, String zipCode) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.phoneNumber = phoneNumber;
		this.zipCode = zipCode;
	}
}
