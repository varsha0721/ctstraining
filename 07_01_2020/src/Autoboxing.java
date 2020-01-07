
public class Autoboxing 
{
	public static void main(String [] args)
	{
		int pInt = 283; // primitive
		Integer wInt; // wrapper
		wInt=pInt; // primitive to wrapper, auto boxing
		int p2=wInt; // wrapper to primitive, auto unboxing
		
		System.out.println(p2);
	}
}
