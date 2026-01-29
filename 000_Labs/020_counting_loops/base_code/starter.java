/*
 *	Author:  Meghan Chiu
 *  Date: 9/30/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("What is your name? ");
	String x=sc.nextLine();
	System.out.print("\nHow many times would you like me to print out your name? ");
	int y=sc.nextInt();
	System.out.println(" ");
	int z=0;
	while(true){
		if(y==z)
			{
				break;
			}
		System.out.println(x);
		z=z+1;
	}
}
}
