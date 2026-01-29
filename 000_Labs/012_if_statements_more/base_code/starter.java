/*
 *	Author:  Meghan Chiu
 *  Date: 9/9/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Please imput your first number: ");
	int x = sc.nextInt();
	System.out.print("Please imput your second number: ");
	int y = sc.nextInt();
	System.out.println(" ");
		if(x==y)
		{
			System.out.println("These variables are the same.");
		}
		if(x!=y)
		{
			System.out.println("These variables are different.");
		}
	}
}
