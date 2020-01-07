package comm.example;

import java.util.Scanner;

public class JaggedArray 
{
	private int array1 [] [] = new int [2][2];
	private int array2 [] [] = new int [2][2];
	private int arraysum [] [] = new int [2][2];
	Scanner scan = new Scanner(System.in);
	public void fillArray()
	{
		System.out.println("enter elements for matrix1");
		for(int i = 0;i<2;i++)
		{
			for(int j = 0;j<2;j++)
			{
				array1[i][j] = scan.nextInt(); 
			}
		}
		System.out.println("enter elements for matrix2");
		for(int i = 0;i<2;i++)
		{
			for(int j = 0;j<2;j++)
			{
				array2[i][j] = scan.nextInt(); 
			}
		}
	}
	
	public void displayArray()
	{
		System.out.println("displaying 1st matrix");
		for(int i = 0;i<2;i++)
		{
			for(int j = 0;j<2;j++)
			{
				System.out.print(array1[i][j]+" ");
			}
			System.out.println(",");
		}
		System.out.println("displaying 2nd matrix");
		for(int i = 0;i<2;i++)
		{
			for(int j = 0;j<2;j++)
			{
				System.out.print(array2[i][j]+" ");
			}
			System.out.println(",");
		}
		System.out.println("displaying 3rd matrix");
		for(int i = 0;i<2;i++)
		{
			for(int j = 0;j<2;j++)
			{
				System.out.print(arraysum[i][j]+" ");
			}
			System.out.println(",");
		}
	}
	
	public void sumOfArray()
	{
		for(int p=0;p<2;p++)
		{
			for (int q=0;q<2;q++)
			{

				
					arraysum[p][q] = array1[p][q] + array2 [p][q];
				
			}
		}
	}

}

