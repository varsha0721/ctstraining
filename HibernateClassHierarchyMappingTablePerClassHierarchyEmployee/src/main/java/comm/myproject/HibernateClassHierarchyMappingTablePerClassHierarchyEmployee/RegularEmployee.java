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
@DiscriminatorValue(value="regular_employee")  

public class RegularEmployee extends Employee
{
	@Column(name="salary")    
	private int salary;  
	  
	@Column(name="bonus")     
	private int bonus;

	public RegularEmployee(String name, int salary, int bonus) {
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}  
	
	
}
