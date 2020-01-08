package comm.myexample;

public class Car implements ProductInterface 
{
	private int carprise;
	@Override
	public void computeSalePrise(int carprise)
	{
		this.carprise = carprise;
		int total = carprise + baseprise;
		System.out.println("Actual car prise:" + total);
	}
}
