package comm.example;

import java.io.File;

public class MyDireactery 
{
	public static void main (String [] args)
	{
		System .out.println("creating Directory");
		String filename = "Mydirectory";
		File fn = new File(filename);
		fn.mkdir();
		System.out.println("direactory is created: " + filename);
		
		System.out.println("creating  1st sub direactory");
		File subdir1 = new File(fn, "Mysubdir1" );
		subdir1.mkdir();
		System.out.println("My first sub direactory id is created:" + subdir1 );
		
		System.out.println("creating  2st sub direactory");
		File subdir2 = new File(fn, "Mysubdir1" );
		subdir1.mkdir();
		System.out.println("My first sub direactory id is created:" + subdir2 );

		if(fn.isFile())
		{
			System.out.println(filename+" is not a directory");
		}
		else
		{
			System.out.println(filename + "is a directory");
		}
	}

}
