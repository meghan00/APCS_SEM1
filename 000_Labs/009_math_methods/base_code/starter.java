/*
 *	Author:  Meghan Chiu
 *  Date: 9/5/2025
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		Scanner sc = new Scanner(System.in);
		int c = Math.max(13 - 6 * 11, 30 % 7 * (-2));
		double d = Math.sqrt(3 * 8 + 31 % 7);
		double z = Math.pow(37 / 3, 35 % 21);
		double a = Math.pow(2,14%3);
		double b = Math.sqrt(2*6);
		double w = Math.max(a,b);
		System.out.println("Maximum = "+c);
		System.out.println("Square Root = "+d);
		System.out.println("Power = "+z);
		System.out.println("Maximum = "+w);
		System.out.println(" ");
		System.out.println("Please enter a double:");
        double x = sc.nextDouble();
        System.out.println("Please enter another double");
        double y = sc.nextDouble();
        System.out.println(" ");
        double max = Math.max(x,y);
        double sqrt = Math.sqrt(y);
        double power = Math.pow(x,y);
        System.out.println("Maximum number of x and y is: "+max);
        System.out.println("Square root of y is: "+sqrt);
        System.out.println("Power of x and y is: "+power);
        
		
	}
}
