package comm.myproject.mySpringProject.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
//@AllArgsConstructor
//@NoArgsConstructor

public class CustomerDao
	{
	List<Customer> list = null;
	Customer cust;
	public Customer createCustomer(String firstname, String lastname, String email, String id)
	{
		cust.setFirstname(firstname);
		cust.setLastname(lastname);
		cust.setEmail(email);
		cust.setId(id);
		list.add(cust);
		return cust;
		
	}
	public List<Customer> displayCustomer()
	{
		return list;	
	}
	public Customer findById(String id)
	{
		for(Customer c : list)
		{
			if(c.getId().equals(id))
			{
				cust.setFirstname(c.getFirstname());
				cust.setLastname(c.getLastname());
				cust.setEmail(c.getEmail());
				cust.setId(c.getId());
			}
		}
		return cust;	
	}
}