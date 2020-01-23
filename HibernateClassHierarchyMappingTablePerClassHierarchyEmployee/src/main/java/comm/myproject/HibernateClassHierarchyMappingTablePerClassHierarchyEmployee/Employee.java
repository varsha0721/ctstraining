package comm.myproject.HibernateClassHierarchyMappingTablePerClassHierarchyEmployee;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Entity  
@Data
@Table(name = "employee")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="type_of_employee",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="employee")  
public class Employee 
{
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	      
	@Column(name = "id")  
	private int id;  
	  
	@Column(name = "name")  
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}  

}
