package comm.example;

public class HelloArrey 
{
	private int count;
	private char [] str;
	public char [] convertToChar(String a)
	{
		str = a.toCharArray();
		return str;
	}
	public void displayNewArrey()
	{
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
			if(str[i]== 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
			{
				count ++;
			}
			
		}
		System.out.println(count);
	}

	
		

	
}
