/*
 *	Author: Meghan Chiu
 *  Date: 9/12/2025
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Please enter an integer: ");
	int x = sc.nextInt();
	System.out.print("Please enter another integer: ");
	int y = sc.nextInt();
	if (x%2!=0)
	{
		System.out.println(x+" is odd!");
	}
	if (y%2!=0)
	{
		System.out.println(y+" is odd!");
	}
	if (x%2==0)
	{
		System.out.println(x+" is even!");
	}
	if (y%2==0)
	{
		System.out.println(y+" is even!");
	}
	

	if(x%3==0)
	{
		if(x%4==0)
		{
			if(x%5==0)
			{
				System.out.println(x+" is divisible by 3, 4, and 5!");
			}
			else if(x%5!=0)
			{
			System.out.println(x+" is not divisible by 5.");	
			}
		}	
		else if(x%4!=0)
		{
		if(x%5==0)
		{
			System.out.println(x+" is not divisible by 4.");
		}
		else if(x%5!=0)
		{
			System.out.println(x+" is not divisible by 4 and 5.");
		}
		}
	}
	else if(x%3!=0)
	{
		if(x%4==0)
		{
			if(x%5==0)
			{
				System.out.println(x+" is not divisible by 3.");
			}
			else if(x%5!=0)
			{
				System.out.println(x+" is not divisible by 3 and 5.");
			}
		}
		else if(y%4!=0)
		{
			if(y%5==0)
			{
				System.out.println(y+" is not divisible by 3 and 4.");
			}
		}
	}
	
	
		if(y%3==0)
	{
		if(y%4==0)
		{
			if(y%5==0)
			{
				System.out.println(y+" is divisible by 3, 4, and 5!");
			}
			else if(y%5!=0)
			{
			System.out.println(y+" is not divisible by 5.");	
			}
		}	
		else if(y%4!=0)
			{
			if(y%5==0)
			{
				System.out.println(y+" is not divisible by 4.");
			}
			if(y%5!=0)
			{
				System.out.println(y+" is not divisible by 4 and 5.");
			}
			}
	}
	else if(y%3!=0)
		{
		if(y%4==0)
		{
			if(y%5==0)
			{
				System.out.println(y+ " is not divisible by 3.");
			}
			else if(x%5!=0)
			{
			System.out.println(x+" is not divisible by 3 and 5.");
			}
		else if(y%4!=0)
		{
			if(y%5==0)
			{
				System.out.println(y+" is not divisible by 3 and 4.");
			}
		}
	else
	{
		System.out.println(y+" is not divisible by 3, 4, and 5.");
	}
		}
	}
}
}
