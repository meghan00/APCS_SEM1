/*
 *	Author:  Meghan Chiu
 *  Date: 9/17/25
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
		else if(x>y)
		{
			System.out.println("\nWRONG!! Your number was bigger than the random number, "+y);
		} 
		else if(x<y)
		{
			System.out.println("\nINCORRECT!! Your number was smaller than the random number, "+y);
		}
	}
}
