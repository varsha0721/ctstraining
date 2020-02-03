package crm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "first_name")
	private String firstname;
	@Column(name = "last_name")
	private String lastName;
	private String email;
	
	public Customer(String firstname, String lastName, String email) 
	{
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
	}		
}
