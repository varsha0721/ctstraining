package comm.example;

import java.util.Comparator;

public class SalaryComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{  
		Employee emp1=(Employee)o1;  
		Employee emp2=(Employee)o2;  
		  
		if(emp1.getSalary() == emp2.getSalary())  
		return 0;  
		else if(emp1.getSalary() > emp2.getSalary())  
		return 1;  
		else  
		return -1;  
		}  
		
}
