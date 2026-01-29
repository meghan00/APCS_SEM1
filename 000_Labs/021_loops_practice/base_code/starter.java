/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int x = (int)(Math.random()*1000+1);
	System.out.println("Please input a number between 1 and 1000: ");
	int y = sc.nextInt();
	while(x!=y){
		if(y<x){
			System.out.println("Your number was too low, guess again: ");
		}
		else if(y>x){
			System.out.println("Your number was too high, guess again: ");
		}
		System.out.println("Please input a number between 1 and 1000: ");
		y = sc.nextInt();	
	}
		System.out.println("You got it correct! YAYAYAYAY");
	}
}
