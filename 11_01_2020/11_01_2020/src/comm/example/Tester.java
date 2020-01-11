package comm.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Tester  
{
	public static void main(String args[]){  
		  
		ArrayList<Employee> al=new ArrayList<Employee>();  
		al.add(new Employee(0,"Rohini","data analysis", "10/10/2000" , 45, 90000));  
		al.add(new Employee(1,"Ranganathan","production","9/10/200 ", 45, 92000));  
		al.add(new Employee(2,"Pankaj","Marketing", "02/02/2002" , 38, 75000));  
		  
		System.out.println("Sorting by salary");  
		  
		Collections.sort(al,new SalaryComparator());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		Employee emp=(Employee)itr.next();  
		System.out.format("EmployeeId: "+emp.getId()+ "EmployeeName: "+emp.getName()+ "Date of joining: "+emp.getDateOfJoining()+ "Age: "+emp.getAge()+ "Salary:"+ emp.getSalary());  
		}  
		  
		System.out.println("Sorting by age");  
		  
		Collections.sort(al,new AgeComparator());  
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
		Employee emp=(Employee)itr2.next();  
		System.out.println("EmployeeId: "+emp.getId()+ "EmployeeName: "+emp.getName()+ "Date of joining: "+emp.getDateOfJoining()+ "Age: "+emp.getAge()+ "Salary:"+ emp.getSalary());  
		}  
		  
		  
		}  
}
