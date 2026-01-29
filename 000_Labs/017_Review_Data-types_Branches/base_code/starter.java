/*
 *	Author:  Meghan Chiu
 *  Date: 9/25/2025
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to ATLA!! You decided to defeat the firelord with Aang!!\nWhat's your name?");
		String b=sc.nextLine();
		if ((b.equals("Aang"))||(b.equals("aang")))
		{
			System.out.println("We already have an Aang...");
		}
		else if((b.equals("Katara"))||(b.equals("katara")))
		{
			System.out.println("My heart is so full of hope, that it's making me tearbend!");
		}
		else if((b.equals("Toph"))||(b.equals("toph")))
		{
			System.out.println("I AM MELONLORD MWAHAHAHAHA");
		}
		else if((b.equals("appa"))||(b.equals("momo")))
		{
			System.out.println("YAYAYAY my favorite great choice");
		}
		else if((b.equals("zuko"))||(b.equals("Zuko")))
		{
			System.out.println("I love zuko sm<3 and also THE SCAR'S NOT ON THE WRONG SIDE!!");
		}
		System.out.println("\nWould you like to be be an earthbender, airbender, waterbender, or firebender?"); 
		String a=sc.nextLine();
		int e=20;
		if ((a.equals("Earthbender"))||(a.equals("earthbender")))
		{
			System.out.println("\nYou've chosen to be an earthbender! Congratulations and good luck!");
			System.out.println("\nYou have 20 points to spend on your skills! Choose wisely...");
			System.out.print("\nBasic Earthbending (1-10) - ");
			int d = sc.nextInt();
			while(d>10)
			{
				System.out.println("This time please enter a number between 0 and 10.");
				d = sc.nextInt();
			}			
			int f=e-d;
			if(d<=10&&d>=0)
			{
				System.out.println("You have "+f+" left to spend");
				System.out.print("\nMetalbending (1-10) - ");
			}
			d = sc.nextInt();
			
			while(d>10)
			{
				System.out.println("This time please enter a number between 0 and 10.");
				d = sc.nextInt();
			}
			int g=f-d;
			if(d<=10&&d>=0)
			{
				System.out.println("You have "+g+" left to spend");
				System.out.print("\nLie Detecting (1-10) - ");
			}
			d = sc.nextInt();
			
			while((d>10)||(d-g>0))
			{
				System.out.println("This time please enter a number between 0 and 10 (under budget).");
				d = sc.nextInt();
			}
			int h=g-d;
			if(d<=10&&d>=0)
			{
				System.out.println("You have "+h+" left to spend");
				System.out.print("\nDefense (1-10) - ");
			}
			d = sc.nextInt();
			
			while((d>10)||(d-h>0))
			{
				System.out.println("This time please enter a number between 0 and 10 (under budget).");
				d = sc.nextInt();
			}
			int i=h-d;
			if(d<=10&&d>=0)
			{
			System.out.println("You have "+i+" left to spend");
			System.out.println("\n----------------------------------------------");
			System.out.println("You are "+b+", an "+a+" with the following stats:");
			int singing = e-f;
			int dancing = f-g;
			int lie = g-h;
			int attitude = h-i;
			System.out.println("Basic Earthbending - "+singing+"\nMetalbending - "+dancing+"\nLie Detecting - "+lie+"\nDefense - "+attitude);
			}
		}
		else if((a.equals("Airbender"))||(a.equals("airbender")))
		{
			System.out.println("\nYou've chosen to be an airbender! Congratulations and good luck!");
			System.out.println("\nYou have 20 points to spend on your skills! Choose wisely...");
			System.out.print("\nBasic Airbending (1-10) - ");
			int d = sc.nextInt();
			while(d>10)
			{
				System.out.println("This time please enter a number between 0 and 10.");
				d = sc.nextInt();
			}			
			int f=e-d;
			if(d<=10&&d>=0)
			{
				System.out.println("You have "+f+" left to spend");
				System.out.print("\nFlight (1-10) - ");
			}
			d = sc.nextInt();
			
			while(d>10)
			{
				System.out.println("This time please enter a number between 0 and 10.");
				d = sc.nextInt();
			}
			int g=f-d;
			if(d<=10&&d>=0)
			{
				System.out.println("You have "+g+" left to spend");
				System.out.print("\nSpirit World connection (1-10) - ");
			}
			d = sc.nextInt();
			
			while((d>10)||(d-g>0))
			{
				System.out.println("This time please enter a number between 0 and 10 (under budget).");
				d = sc.nextInt();
			}
			int h=g-d;
			if(d<=10&&d>=0)
			{
				System.out.println("You have "+h+" left to spend");
				System.out.print("\nDefense (1-10) - ");
			}
			d = sc.nextInt();
			
			while((d>10)||(d-h>0))
			{
				System.out.println("This time please enter a number between 0 and 10 (under budget).");
				d = sc.nextInt();
			}
			
			int i=h-d;
			if(d<=10&&d>=0)
			{
			if(d<=10&&d>=0){
			System.out.println("You have "+i+" left to spend");
			System.out.println("\n----------------------------------------------");
			System.out.println("You are "+b+", an "+a+" with the following stats:");
			int singing = e-f;
			int dancing = f-g;
			int star = g-h;
			int attitude = h-i;
			System.out.println("Basic Airbending - "+singing+"\nFlight - "+dancing+"\nConnection to the Spirit World - "+star+"\nDefense - "+attitude);
			}
		}
		}
		else if((a.equals("waterbender"))||(a.equals("Waterbender")))
		{
			System.out.println("\nYou've chosen to be a waterbender! Congratulations and good luck!");
			System.out.println("\nYou have 20 points to spend on your skills! Choose wisely...");
			System.out.print("\nBasic Waterbending (1-10) - ");
			int d = sc.nextInt();
			while(d>10){
				System.out.println("This time please enter a number between 0 and 10.");
				d = sc.nextInt();
			}
			int f=e-d;
			if(d<=10&&d>=0){
			System.out.println("You have "+f+" left to spend");
			System.out.print("\nBloodbending (1-10) - ");
			d = sc.nextInt();
			}
			
			while(d>10){
				System.out.println("This time please enter a number between 0 and 10.");
				d = sc.nextInt();
			}
			int g=f-d;
			if(d<=10&&d>=0){
				System.out.println("You have "+g+" left to spend");
				System.out.print("\nHealing (1-10) - ");
				d = sc.nextInt();
			}
			
			while((d>10)||(d-g>0)){
				System.out.println("This time please enter a number between 0 and 10 (under budget).");
				d = sc.nextInt();
			}
			int h=g-d;
			if(d<=10&&d>=0){
				System.out.println("You have "+h+" left to spend");
				System.out.print("\nDefense (1-10) - ");
				d = sc.nextInt();
			}
			while((d>10)||(d-h>0)){
				System.out.println("This time please enter a number between 0 and 10 (under budget).");
				d = sc.nextInt();
			}
			int i=h-d;
			if(d<=10&&d>=0){
			System.out.println("You have "+i+" left to spend");
			System.out.println("\n----------------------------------------------");
			System.out.println("You are "+b+", audition number 67.\nYou are a "+a+" with the following stats:");
			int singing = e-f;
			int dancing = f-g;
			int star = g-h;
			int attitude = h-i;
			System.out.println("Basic Waterbending - "+singing+"\nBloodbending - "+dancing+"\nHealing - "+star+"\nDefense - "+attitude);
			}
			
		}
		else if((a.equals("Firebender"))||(a.equals("firebender")))
		{
			System.out.println("\nYou've chosen to be an firebender! Congratulations and good luck!");
			System.out.println("\nYou have 20 points to spend on your skills! Choose wisely...");
			System.out.print("\nBasic Firebending (1-10) - ");
			int d = sc.nextInt();
			while(d>10)
			{
				System.out.println("This time please enter a number between 0 and 10.");
				d = sc.nextInt();
			}			
			int f=e-d;
			if(d<=10&&d>=0)
			{
				System.out.println("You have "+f+" left to spend");
				System.out.print("\nLightning (1-10) - ");
			}
			d = sc.nextInt();
			
			while(d>10)
			{
				System.out.println("This time please enter a number between 0 and 10.");
				d = sc.nextInt();
			}
			int g=f-d;
			if(d<=10&&d>=0)
			{
				System.out.println("You have "+g+" left to spend");
				System.out.print("\nCombustion Bending (1-10) - ");
			}
			d = sc.nextInt();
			
			while((d>10)||(d-g>0))
			{
				System.out.println("This time please enter a number between 0 and 10 (under budget).");
				d = sc.nextInt();
			}
			int h=g-d;
			if(d<=10&&d>=0)
			{
				System.out.println("You have "+h+" left to spend");
				System.out.print("\nDefense (1-10) - ");
			}
			d = sc.nextInt();
			
			while((d>10)||(d-h>0))
			{
				System.out.println("This time please enter a number between 0 and 10 (under budget).");
				d = sc.nextInt();
			}
			int i=h-d;
			if(d<=10&&d>=0)
			{
			System.out.println("You have "+i+" left to spend");
			System.out.println("\n----------------------------------------------");
			System.out.println("You are "+b+", an "+a+" with the following stats:");
			int singing = e-f;
			int dancing = f-g;
			int star = g-h;
			int attitude = h-i;
			System.out.println("Basic Firebending - "+singing+"\nLightning - "+dancing+"\nCombustion Bending - "+star+"\nDefense - "+attitude);
			}
			else if((d>10)||(d>0))
			{
				System.out.println("Rerun the program and this time please enter a number between 0 and 10.");
			}
		}
		else
		{
			System.out.println("You are unproffessional. Please restart the program and choose an element.");
		}
		
		System.out.println("\nGood luck on your quest "+b+"!");
	
}
}
