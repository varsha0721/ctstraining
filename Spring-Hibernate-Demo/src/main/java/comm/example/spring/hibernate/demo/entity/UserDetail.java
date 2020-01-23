package comm.example.spring.hibernate.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.beans.factory.annotation.Required;

import lombok.Data;

@Entity
@Data
@Table(name = "userdetail")
public class UserDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String userId;
	@Length(min = 8,max = 15,message = "invalid username")
	private String userName;
	@Email(message = "invalid email")
	private String email;
	
	public UserDetail(String userId, String userName, String email) 
	{
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
	}
}