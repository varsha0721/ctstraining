package comm2.example;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestList 
{
	private LinkedList<String> ls= new LinkedList<String>();
	
	public void getSortedList()
	{
		ls.add("a");
		ls.add("p");
		ls.add("p");
		ls.add("l");
		ls.add("e");
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);	
	}
	
}
