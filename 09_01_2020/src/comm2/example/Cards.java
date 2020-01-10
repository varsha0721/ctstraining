package comm2.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Cards 
{
	static int n = 4;
	private LinkedList<String> ls= new LinkedList<String>();

	static String card [] = {
		//public void getCardsList()
		//{
			("ace , heart"),
			("king , heart"),
			("queen , heart"),
			("jake , heart"),
			("10 , heart"),
			("9 , heart"),
			("8 , heart"),
			("7 , heart"),
			("6 , heart"),
			("5 , heart"),
			("4 , heart"),
			("3 , heart"),
			("1 , heart"),
			
			("ace , diamond"),
			("king , diamond"),
			("queen , diamond"),
			("jake , diamond"),
			("10 , diamond"),
			("9 , diamond"),
			("8 , diamond"),
			("7 , diamond"),
			("6 , diamond"),
			("5 , diamond"),
			("4 , diamond"),
			("3 , diamond"),
			("1 , diamond"),
			
			("ace , club"),
			("king , club"),
			("queen , club"),
			("jake , club"),
			("10 , club"),
			("9 , club"),
			("8 , club"),
			("7 , club"),
			("6 , club"),
			("5 , club"),
			("4 , club"),
			("3 , club"),
			("1 , club"),
			
			("ace , spade"),
			("king , spade"),
			("queen , spade"),
			("jake , spade"),
			("10 , spade"),
			("9 , spade"),
			("8 , spade"),
			("7 , spade"),
			("6 , spade"),
			("5 , spade"),
			("4 , spade"),
			("3 , spade"),
			("1 , spade") 
			};
			
			/*System.out.println("before shuffling");
			System.out.println(card);
			Collections.shuffle(ls);
			System.out.println("after shuffling");
			System.out.println(ls);
			System.out.println("enter no of players");	
			List<String> player1 = player1.subList(0, 13); 
			System.out.println("cards of player1");	
			List<String> player2 = player2.subList(14, 26);
			List<String> player3 = player3.subList(27, 40);
			List<String> player4 = player4.subList(41, 52);
		}*/

	public static void main(String[] args)
	{
		List<String> l = new ArrayList<String>();
		//Cards card =new Cards();
		for(String array : card)
		{
			System.out.println(array);
		}
		l = Arrays.asList(card);
		System.out.println(l);
		System.out.println("before shuffling");
		System.out.println(l);
		Collections.shuffle(l);
		System.out.println("after shuffling");
		System.out.println(l);
		int k = 52/n;
		for (String ls:l)
		{
			List<String> player1 = player1.subList(0, k); 	
		}
		
	}
	
}
	