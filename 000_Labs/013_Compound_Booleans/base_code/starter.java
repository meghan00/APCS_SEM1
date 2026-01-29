/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int x = sc.nextInt();
		System.out.print("Please enter another integer: ");
		int y = sc.nextInt();
		System.out.print("Please enter a third integer: ");
		int z = sc.nextInt();
		
		if ((x>y)&&(x>z))
		{
			System.out.println("\n"+x+" is the largest integer.");
		}
		else if ((y>x)&&(y>z))
		{
			System.out.println("\n"+y+" is the largest integer.");
		}
		else if ((z>y)&&(z>x))
		{
			System.out.println("\n"+z+" is the largest integer.");
		}
		
		if ((x<y)&&(x<z))
		{
			System.out.println(x+" is the smallest integer.");
		}
		else if ((y<x)&&(y<z))
		{
			System.out.println(y+" is the smallest integer.");
		}
		else if ((z<y)&&(z<x))
		{
			System.out.println(z+" is the smallest integer.");
		}
	}
}
