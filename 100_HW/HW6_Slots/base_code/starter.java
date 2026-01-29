/*
 *	Author: Meghan Chiu
 *  Date: 10/3/25
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int a = 100;
	int wager = 0;
	String play = "hello friend";
	System.out.println("Hello and welcome to my gambling table!!");
	System.out.println("Here are the Slot Machine Rules :\n1) Each player starts with $100.\n2) Then imput a wager less than or equal to your total sum of money.");
	System.out.println("3) The slot machine will roll 3 numbers from 1 to 10.");
	System.out.println("   a. If two numbers match, you double your money.\n   b. If three numbers match, you triple your money.\n   c. If none match, you lose your money.");
	System.out.println("----------------------------------------------------------");
	while(true){
		System.out.print("\nWould you like to play the slots? (Yes/yes/y/Y) : ");
		play = sc.nextLine();
		if((play.equalsIgnoreCase("y"))||(play.equalsIgnoreCase("yes"))){
			System.out.print("You have $"+a+". How much would you like to wager? ");
			wager = sc.nextInt();
			sc.nextLine();
			while(wager>a){
				System.out.print("You only have $"+a+"! Please enter a smaller number: ");
				wager = sc.nextInt();
				sc.nextLine();
			}
			while(wager<=0){
				System.out.print("hey thats not allowed! no negatives or zero! Please enter a larger integer: ");
				wager = sc.nextInt();
				sc.nextLine();
			}
			
			System.out.println("\nGreat! Let's play!!\nYour rolls are:");
			a=a-wager;
			int ran1=(int)(Math.random()*10+1);
			int ran2=(int)(Math.random()*10+1);
			int ran3=(int)(Math.random()*10+1);
			System.out.println("________________");
			System.out.println("  "+ran1+" | "+ran2+" | "+ran3);
			System.out.println("________________");
			if((ran1==ran2)||(ran1==ran3)||(ran2==ran3)){
				a=2*wager+a;
				System.out.println("YOU WON!! Your wager has now DOUBLED!!\nYou now have $"+a);
			}
			else if((ran1==ran2)&&(ran2==ran3)){
				a=3*wager+a;
				System.out.println("JACKPOT!! Your wager has now TRIPLED!!\nYou now have $"+a);
			}
			else{
				System.out.println("oops... well don't be a sore loser...\nYou now have $"+a);
			}
			System.out.println("\n-----------------------------------------------");
			if(a==0){
				System.out.println("sorry I guess gambling didn't work out for you? come again soon?");
				return;
			}
		}
		else if((play.equalsIgnoreCase("n"))||(play.equalsIgnoreCase("no"))){
			System.out.println("OH NO you still had $"+a+" left! Make the right financial choice and come back soon mkay??");
			return;
		}
		else{
			System.out.println("Sorry- that wasn't a valid answer. Try again.");
		}
	

	}
	}
	
}
