package comm.myproject.HibernateClassHierarchyMappingTablePerClassHierarchyEmployee;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@DiscriminatorValue(value="contract_employee")
public class ContractEmployee extends Employee
{
	 @Column(name="pay_per_hour")  
	    private float pay_per_hour;  
	      
	    @Column(name="contract_duration")  
	    private String contract_duration;

		public ContractEmployee(String name, float pay_per_hour, String contract_duration) {
			super(name);
			this.pay_per_hour = pay_per_hour;
			this.contract_duration = contract_duration;
		}  
}
