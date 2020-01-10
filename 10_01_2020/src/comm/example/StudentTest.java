package comm.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentTest 
{
	public static void main(String [] args)
	{
		List<Student> l=new ArrayList<Student>();
		//Student obj = new Student();
		l.add( new Student(1,"Vijay","Dao",8.0));
		l.add( new Student(2,"sachin","tendulkar",9.0));
		l.add( new Student(3,"rahul","dravid",7.0));
		l.add( new Student(4,"ms","Dhoni",6.0));	
		Collections.sort(l);
		
		Iterator<Student> itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
