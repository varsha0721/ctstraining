package comm.example;

public class MyArray 
{
	private char [] s;
	{
		s = new char[26];
	}
	public char[] createArrey()
	{
		for(int i=0;i<s.length;i++)
		{
			s[i]=(char) ('A'+ i);				
		}
		return s;
	}

	public void displayArrey()
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+",");
		}
	}
}
