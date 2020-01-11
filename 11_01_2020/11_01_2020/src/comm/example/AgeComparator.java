package comm.example;

import java.util.Comparator;

public class AgeComparator  implements Comparator
{
	public int compare(Object o1,Object o2)
	{  
		Employee emp1=(Employee)o1;  
		Employee emp2=(Employee)o2;  
		  
		if(emp1.getAge() == emp2.getAge())  
		return emp1.getDateOfJoining().compareTo(emp2.getDateOfJoining());  
		else if(emp1.getAge() > emp2.getAge())  
		return 1;  
		else  
		return -1;  
		}  
		
}
