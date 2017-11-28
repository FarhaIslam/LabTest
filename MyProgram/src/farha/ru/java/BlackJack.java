package farha.ru.java;
import java.io.*;
import java.util.Scanner;

public class BlackJack {
    
	private static int playercard1, playercard2, dealercard1, dealercard2, playerstotal, dealerstotal;
	
	public static void playersHit()
	{
		int playercard = (int) (Math.random() * 9 + 2);
		System.out.println("You drew a " + playercard + ".");
		playerstotal +=playercard;
		System.out.println("Your score is " + playerstotal);
	}
	
	public static void playersCard()
	{
		System.out.println("Welcome to Farha's Blackjack Program!");
		playercard1 = (int) (Math.random() * 9 + 2);
		playercard2 = (int) (Math.random() * 9 + 2);
		System.out.println("You drew a " + playercard1 + " and a " + playercard2 + ".");
		playerstotal = playercard1 + playercard2;
		System.out.println("Your total is " + playerstotal + ".");
		System.out.println();
	}
	
	public static void dealersCard()
	{
		dealercard1 = (int) (Math.random() * 9 + 2);
		dealercard2 = (int) (Math.random() * 9 + 2);
		dealerstotal = dealercard1 + dealercard2;
		System.out.println("The dealer has a " + dealercard1 + " showing and the other card hidden.");
		System.out.println("His total is hidden, too.");
		System.out.println();
	}
	
	public static void dealerhit()
	{
		System.out.println("Dealer chooses to hit.");
		int dealercard = (int) (Math.random() * 9 + 2);
		System.out.println("He draws a " + dealercard + ".");
		dealerstotal += dealercard;
		System.out.println("His total is " + dealerstotal);
		System.out.println();
		
	}
	
	public static void main(String[] args)
	{
            playersCard();
		
		if(playerstotal > 21)
			System.out.println("DEALER WINS!");
		
		else
		{	
			
			dealersCard();
			System.out.println("Would you like to hit or stay?(h/s)");
			Scanner s = new Scanner(System.in);
			String str = s.next();
			
			while(str.charAt(0) != 's')
			{
					
				if(str.charAt(0) == 'h')
					playersHit();
					
				if(playerstotal > 21)
					{
						System.out.println("DEALER WINS!");
						break;
					}
					
				else if(str.charAt(0) != 'h' && str.charAt(0) != 's')
					{	
						System.out.println("Wrong format, please type 'h' or 's':");
					}
					
				System.out.println("Would you like to hit or stay?(h/s)");
				str = s.next();
			}
			if(playerstotal <= 21)
			{
				System.out.println("Okay, dealer's turn.");
				while(dealerstotal < 16)
				{
					dealerhit();
					if(dealerstotal > 21)
						System.out.println("YOU WIN!");
				}
				if(dealerstotal <= 21)
				{
					System.out.println("Dealer stays.");
					System.out.println();
					System.out.println("Dealer's total is " + dealerstotal);
					System.out.println("Your total is " + playerstotal);
					if(dealerstotal >= playerstotal)
					{
						System.out.println("DEALER WINS!");
					}
					else
						System.out.println("YOU WIN!");
				}
			}
		}
	}


}
