package comm.example;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myArray = {1,2,3,4,5,6};
		int [] hold = {10,9,8,7,6,5,4,3,2,1};
		System.arraycopy(myArray,0,hold,0,myArray.length);
		for(int a:hold)
		{
			System.out.println(a);
		}
	}

}
