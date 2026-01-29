/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
public static void print(String a){
	System.out.print(a);
}
public static void println(String a){
	System.out.println(a);
}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		println("Welcome to my ATM");
		println("We're creating a bank account! What info do we know?");
		println("1 - Nothing\n2 - Owner\n3 - Owner and Initial Deposit");
		int x = sc.nextInt();
		sc.nextLine();
		if(x==1){
			println("\nAccount successfully created!\n");
			BankAccount basic = new BankAccount();
			basic.displayAccountInfo();
			println("\nWould you like to see your balance? (y/n)");
			String y = sc.nextLine();
			if(y.equals("y")){
				basic.checkBalance();
			}
			else if(y.equals("n")){
				println("Great! No balance checked.");
			}
			else{
				println("uhm seriously");
			}
		}
		else if(x==2){
			System.out.println("What is the name of the owner of this bank account?");
			String o  = sc.nextLine();
			println(" ");
			BankAccount owner = new BankAccount(o);
			owner.displayAccountInfo();
			println("\nWould you like to see your balance? (y/n)");
			String y = sc.nextLine();
			if(y.equals("y")){
				owner.checkBalance();
			}
			else if(y.equals("n")){
				println("Great! No balance checked.");
			}
			else{
				println("uhm seriously");
			}
		}
		else if(x==3){
			System.out.println("What is the name of the owner of this bank account?");
			String o = sc.nextLine();
			System.out.println("How much are you initally depositing into this account?");
			double b = sc.nextDouble();
			sc.nextLine();
			println(" ");
			BankAccount initial = new BankAccount(o, b);
			initial.displayAccountInfo();
			println("\nWould you like to see your balance? (y/n)");
			String y = sc.nextLine();
			if(y.equals("y")){
				initial.checkBalance();
			}
			else if(y.equals("n")){
				println("Great! No balance checked.");
			}
			else{
				println("uhm seriously");
			}
		}
		System.out.println("thank you for visiting my ATM! <3 I hope you deposit again soon!");
		
		
	}
}
