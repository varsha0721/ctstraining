package comm.test;
import comm.example.Employee;
public class Tester {
	public static void main(String[] args)
	{
		
		Employee employee = Employee.createEmployee(101,"abe",1000);
		System.out.println(employee.displayEmployeeDetails());
	}

}
