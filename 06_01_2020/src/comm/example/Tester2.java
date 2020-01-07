package comm.example;

public class Tester2 
{
	public static void main(String [] args)
	{
		MyClass myClass=new MyClass();
		System.out.println(myClass.add("john ", 100, 200));
		System.out.println("Result= "+myClass.add(10,20,30));
	}
}
