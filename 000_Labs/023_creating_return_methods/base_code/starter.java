/*
 *	Author: Meghan Chiu 
 *  Date: 10/9/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number?");
		int x = sc.nextInt();
		System.out.println("What is your exponent number?");
		int y = sc.nextInt();
		System.out.println("Your answer is : "+(pow(x,y)));
		
	}
	public static int pow(int x, int y){
		int a=1;
		int z=x;
		while(a<y){
			x=z*x;
			a=a+1;
		}
		return x;
		
	}
}
