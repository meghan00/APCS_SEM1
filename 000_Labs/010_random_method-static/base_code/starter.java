/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int x = (int)(Math.random()*10);
		int y = (int)(Math.random()*100+1);
		double z = (double)(Math.random()*1+2.5);
		double w = (double)(Math.random()*575+14);
		System.out.println("A number between 0 - 9: "+x); 
		System.out.println("A number between 1 - 100: "+y); 
		System.out.println("A number between 2.5 - 3.5: "+z); 
		System.out.println("A number between 14 - 589: "+w); 
	}
}
