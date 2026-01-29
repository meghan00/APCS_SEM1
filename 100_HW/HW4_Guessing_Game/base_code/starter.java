/*
 *	Author: Meghan Chiu
 *  Date 9/19/25
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to my opinion based guessing game!!!! \ndisclaimer-you can disagree, but you're just wrong :)");
		System.out.println("---------------------------------------------");
		int x=(int)(Math.random()*3+1);
		
		if(x==1)
		{
		System.out.println("\nWhat is the absolute best boba order?");
		String boba=sc.nextLine();
			if((boba.equals("Traditional Milk Tea with Boba and Lychee Jelly"))||(boba.equals("traditional milk tea with boba and lychee jelly")))
			{
				System.out.println("\nYAYDYSYFDSJDJS YOU HAVE GOOD BOBA TASTE!!!");
			}
			else
			{
				System.out.println("\nNOPE thats WRONG-but here's a hint anyways.\nIt has 2 toppings");
				boba=sc.nextLine();
				if((boba.equals("Traditional Milk Tea with Boba and Lychee jelly"))||(boba.equals("traditional milk tea with boba and lychee jelly")))
				{
				System.out.println("\nYAYDYSYFDSJDJS YOU HAVE GOOD BOBA TASTE!!!");
				}
				else
				{
					System.out.println("\nwow do you just not drink boba? The answer was Traditional Milk Tea with Boba and Lychee Jelly ;P");
				}
			}
			
		}
		if(x==2)
		{
		System.out.println("Whats the best hogwarts house?");
		String hogwarts=sc.nextLine();
			if ((hogwarts.equals("Slytherin"))||(hogwarts.equals("slytherin")))
			{
				System.out.println("\nYAYY you're a true potterhead and a true slytherin!!!");
			}
			else
			{
				System.out.println("\noh.... you aren't a ravenclaw huh...\nHere's a clue anyways: Their common room is in the dungeons.");
				hogwarts=sc.nextLine();
				if ((hogwarts.equals("Slytherin"))||(hogwarts.equals("slytherin")))
				{
					System.out.println("\nfacts!!!");
				}
				else
				{
					System.out.println("\n So you either have never read Harry Potter or you're just wrong. ");
				}
			}
		}
	if(x==3)
	{
	System.out.println("Whats the best k-pop group? (and yes they ARE k-pop)");
	String katseye=sc.nextLine();
		if((katseye.equals("KATSEYE"))||(katseye.equals("katseye"))||(katseye.equals("Katseye")))
		{
			System.out.println("YAYAYAYYAYAY I onehundredthousandtrillion percent agree!!");
		}
		else
		{
			System.out.println("I mean there are a lot of good ones... but I'll give you another hint.\nThey debuted a year ago and have six members.");
			katseye=sc.nextLine();
			if((katseye.equals("KATSEYE"))||(katseye.equals("katseye"))||(katseye.equals("Katseye")))
			{
				System.out.println("YAYAYAYYAYAY I onehundredthousandtrillion percent agree!!");
			}
			else
			{
				System.out.println("no!! the answer was KATSEYE");
			}
		}
		
	}
	}
}
