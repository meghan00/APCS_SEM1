/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to KATSEYE!! YOu are the 7th member to complete the group!!\nWould you like to be be a vocalist, dancer, or visual?"); 
		String a=sc.nextLine();
		if ((a.equals("Visual"))||(a.equals("visual")))
		{
			System.out.println("\nYou've chosen to be the main visual! Congratulations and welcome to KATSEYE!");
		}
		else if((a.equals("Vocalist"))||(a.equals("vocalist")))
		{
			System.out.println("\nYou've chosen to be the main vocalist! Congratulations and welcome to KATSEYE!");
		}
		else if((a.equals("Dancer"))||(a.equals("dancer")))
		{
			System.out.println("\nYou've chosen to be the main dancer! Congratulations and welcome to KATSEYE!");
		}
		else
		{
			System.out.println("You are unproffessional. Please restart the program and choose a speciality.");
		}
	}
}
