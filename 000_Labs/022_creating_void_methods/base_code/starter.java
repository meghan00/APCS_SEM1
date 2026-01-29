/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence:");
		String x = sc.nextLine();
		System.out.println("Write a sentence:");
		String y = sc.nextLine();
		System.out.println(" ");
		toString(x);
		toStringCombined(x, y);
	}
	public static void toString(String x){
		System.out.println(x);
		return;
	}
	public static void toStringCombined(String x, String y){
		System.out.println(x+" "+y);
		return;
	}
}
