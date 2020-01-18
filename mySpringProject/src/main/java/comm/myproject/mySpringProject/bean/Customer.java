package comm.myproject.mySpringProject.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@AllArgsConstructor
@NoArgsConstructor
//@Getter
//@Setter
public class Customer 
{
	private String firstname;
	private String lastname;
	private String email;
	private String id;
	
	public Customer(String firstname, String lastname, String email, String id) 
	{
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.id = id;
	}
	
	
	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	@Override
	public String toString() 
	{
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", id=" + id + "]";
	}

}