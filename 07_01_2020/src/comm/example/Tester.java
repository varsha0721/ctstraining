package comm.example;

public class Tester
{

		public static void main(String[] args) 
		{
			Count counter1=new Count("MyObject-1== ");
			System.out.printf("%s",counter1);
			Count counter2=new Count("MyObject-2== ");
			System.out.printf("%s",counter2.toString());
			Count counter3=new Count("MyObject-3== ");
			System.out.printf("%s",counter3.toString());
			Count counter4=new Count("MyObject-4== ");
			System.out.printf("%s",Count.displayCount());

		}

	}
