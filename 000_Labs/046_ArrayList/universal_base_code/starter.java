/*
 *	Author:  Meghan Chiu
 *  Date: 1/23/26
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many cookies would you like?");
		int answer = sc.nextInt();
		sc.nextLine();
		String [] cookies = new String [answer];
		
		for(int i = 0; i<cookies.length; i++){
			System.out.println("What would you like your #"+(i+1)+" cookie to be?");
			cookies[i] = sc.nextLine();
		}
		
		System.out.println("--------------------------------------------------");
		int a = 1;
		for(String cookie: cookies){
			System.out.println("Cookie #"+a+": "+cookie);
			a++;
		}



	}
}
