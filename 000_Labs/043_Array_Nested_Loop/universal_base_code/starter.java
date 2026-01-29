/*
 *	Author:  Meghan Chiu
 *  Date: 1/12/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What width would you like for your box? ");
		int width = sc.nextInt();
		sc.nextLine();
		System.out.print("\nWhat length would you like for your box? ");
		int length = sc.nextInt();
		sc.nextLine();
		System.out.print("\nWhat symbol would you like for your box? ");
		String sym = sc.nextLine();
		System.out.println(" ");
		int i =0;
		int a =0;
		while((a<length)&&(i<width)){
		 while(i<width){
		 	System.out.print(sym);
		 	i++;
		 }
		 System.out.println("");
		 a++;
		 i=0;
		}


		
	}
}
