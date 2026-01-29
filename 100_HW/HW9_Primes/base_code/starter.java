/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int x){
		int a = x-1;
		while(x%a!=0){
		
			if(a==2){
				if(x%2!=0){
				return true;
				}
			}
			a=a-1;
			}
		return false;
		}
		
	public static void printPrimes(int x){
		int c = 2;
		if(x>=2){
			System.out.println("2");
		}
		while(c<x){
			boolean prime = checkPrime(c);
			if(prime){
				System.out.println(c);	
			}
			c=c+1;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int x = sc.nextInt();
		printPrimes(x);
	}
}
