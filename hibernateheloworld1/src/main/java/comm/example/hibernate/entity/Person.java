package comm.example.hibernate.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
public class Person {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "dateandtime")
	private  LocalDateTime dateandtime;
	@Column(name = "uid")
	private String uid;
	
	public Person(String name, LocalDateTime dateandtime, String uid) 
	{
		super();
		this.name = name;
		this.dateandtime = dateandtime;
		this.uid = uid;
	}
}