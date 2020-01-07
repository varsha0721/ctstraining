package comm.example;

public abstract class Transport 
{
	private double fuel;
	private int distence;
	private int start_point;
	private int end_point;
	public double getFuel() 
	{
		return fuel;
	}
	public int getDistence() 
	{
		return distence;
	}
	public void setDistence(int distence) 
	{
		this.distence = distence;
	}
	public void setFuel(double fuel) 
	{
		this.fuel = fuel;
	}
	public abstract void calculateDistence();
	public abstract void calculateFuel();
}
