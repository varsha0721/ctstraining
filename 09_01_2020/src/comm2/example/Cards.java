package comm2.example;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Cards 
{
	private LinkedList<String> ls= new LinkedList<String>();

		public void getCardsList()
		{
			ls.add("ace , heart");
			ls.add("king , heart");
			ls.add("queen , heart");
			ls.add("jake , heart");
			ls.add("10 , heart");
			ls.add("9 , heart");
			ls.add("8 , heart");
			ls.add("7 , heart");
			ls.add("6 , heart");
			ls.add("5 , heart");
			ls.add("4 , heart");
			ls.add("3 , heart");
			ls.add("1 , heart");
			
			ls.add("ace , diamond");
			ls.add("king , diamond");
			ls.add("queen , diamond");
			ls.add("jake , diamond");
			ls.add("10 , diamond");
			ls.add("9 , diamond");
			ls.add("8 , diamond");
			ls.add("7 , diamond");
			ls.add("6 , diamond");
			ls.add("5 , diamond");
			ls.add("4 , diamond");
			ls.add("3 , diamond");
			ls.add("1 , diamond");
			
			ls.add("ace , club");
			ls.add("king , club");
			ls.add("queen , club");
			ls.add("jake , club");
			ls.add("10 , club");
			ls.add("9 , club");
			ls.add("8 , club");
			ls.add("7 , club");
			ls.add("6 , club");
			ls.add("5 , club");
			ls.add("4 , club");
			ls.add("3 , club");
			ls.add("1 , club");
			
			ls.add("ace , spade");
			ls.add("king , spade");
			ls.add("queen , spade");
			ls.add("jake , spade");
			ls.add("10 , spade");
			ls.add("9 , spade");
			ls.add("8 , spade");
			ls.add("7 , spade");
			ls.add("6 , spade");
			ls.add("5 , spade");
			ls.add("4 , spade");
			ls.add("3 , spade");
			ls.add("1 , spade");
			
			System.out.println("before shuffling");
			System.out.println(ls);
			Collections.shuffle(ls);
			System.out.println("after shuffling");
			System.out.println(ls);
			System.out.println("enter no of players");	
			List<String> player1 = player1.subList(0, 13); 
			System.out.println("cards of player1");	
			List<String> player2 = player2.subList(14, 26);
			List<String> player3 = player3.subList(27, 40);
			List<String> player4 = player4.subList(41, 52);
		}

	public static void main(String[] args)
	{
		Cards card =new Cards();
		card.getCardsList();
	}
	
}
	