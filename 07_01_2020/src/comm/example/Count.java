package comm.example;



public class Count {

	private static Integer count;
	private String temp;
	//static block is used to initialize static attributes
	static {
		count = 0;
	}

	public Count(String temp) {
		super();
		count++;
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "Count of object is: " + temp + count;
	}

	public static String displayCount() {
		return count.toString();
	}

}