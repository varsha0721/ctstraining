package comm.test;
import comm.example.Employee;
public class Nonstaticcall {
	public static void main(String[] args)
	{
		
		Employee emp = new Employee();
		emp.Employee(101,"abe",1000.0);
		System.out.println(emp.displayEmployeeDetails());
	}

}
