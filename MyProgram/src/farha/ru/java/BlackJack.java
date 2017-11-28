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
	
}
