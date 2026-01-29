/*
 *	Author:  Meghan Chiu
 *  Date: 12/4
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first name and last name with a space in the middle.");
		String x = sc.nextLine();
		System.out.print("The last name is :");
		System.out.println(x.substring(x.indexOf(" ")));

		
	}
}
