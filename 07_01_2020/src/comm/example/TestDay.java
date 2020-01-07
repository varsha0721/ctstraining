package comm.example;

public class TestDay 
{
	public static void main(String [] args)
	{
		MyDay obj =new MyDay(DAY.SUN);
		System.out.println("Day: "+obj.getday().getDay());
		System.out.println(" Day Rank: "+obj.getday().getDayno());
	}
}
