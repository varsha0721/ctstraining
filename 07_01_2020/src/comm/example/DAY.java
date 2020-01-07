package comm.example;

public enum DAY 
{
	MON("Today is monday",1),
	TUE("Today is tuesday",2),
	SAT("Today is holiday",6),
	SUN("Today is holiday",7);
	
	private final String day;
	private final int dayno;
	
	private DAY(String day, int dayno)
	{
		this.day = day;
		this.dayno = dayno;
	}
	
	public String getDay() 
	{
		return day;
	}
	public int getDayno()
	{
		return dayno;
	}
}
