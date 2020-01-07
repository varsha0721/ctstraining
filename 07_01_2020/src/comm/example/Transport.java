package comm.example;

public abstract class Transport {
	private double distance;
	private double efficiency;
	
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getEfficiency() {
		return efficiency;
	}
	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}
	
	abstract double calculateDistance(double initialdistance, double finaldistance);
	abstract double calculateEfficiency(double initialfuel,double finalfuel);
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fuel Efficiency: "+getEfficiency();
	}


}