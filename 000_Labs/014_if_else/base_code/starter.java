/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int y=(int)(Math.random()*999+1);
		System.out.print("Please pick enter a number 1-1000: ");
		int x=sc.nextInt();
		
		if (x==y)
		{
			System.out.println("\nYou guessed correctly! "+x+" is the the random number!");
		}
		else
		{
			System.out.println("\nYour number was not the random number. The random number was "+y);
		}
		
	}
}
