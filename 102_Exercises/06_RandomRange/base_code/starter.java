/*
 *	Author: Meghan Chiu
 *  Date: 9/16/25
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int x = sc.nextInt();
		System.out.print("Please enter another integer(bigger than the first): ");
		int y = sc.nextInt();
		System.out.println(" ");

		while (y<=x)
		{
		
			System.out.print("Please re-enter an integer (bigger than the first):");
			y = sc.nextInt();
			
		}
		
		System.out.println("\nYour range is "+x+" to "+y+".\nHere are the 5 numbers generated in that range:");
		int z=(int)(Math.random()*(y-x)+x);
		System.out.print(z);
		int a=(int)(Math.random()*(y-x)+x);
		System.out.print(", "+a);
		int b=(int)(Math.random()*(y-x)+x);
		System.out.print(", "+b);
		int c=(int)(Math.random()*(y-x)+x);
		System.out.print(", "+c);
		int d=(int)(Math.random()*(y-x)+x);
		System.out.println(", "+d+".");
		
		
		
		
	}
}
