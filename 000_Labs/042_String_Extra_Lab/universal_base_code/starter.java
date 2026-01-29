/*
 *	Author:  Meghan Chiu
 *  Date: 12/11/25 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence.");
		String x = sc.nextLine();
		String last=x.substring(0, x.indexOf(" "));
		String first = x.substring(x.lastIndexOf(" "));
		System.out.print(first);
		
		x = x.substring(x.indexOf(" "), x.lastIndexOf(" "));
		
		while(x.indexOf(" ")!=-1){
			System.out.print(x.substring(x.lastIndexOf(" ")));
			x = x.substring(0, x.lastIndexOf(" "));
		}
		System.out.print(x+" "+last);
		
	}
}
