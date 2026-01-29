/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		 int [] one = new int[1000];
		 int x = 0;
		 while(x<one.length){
		 	int y=(int)(Math.random()*100);
		 	one[x] = y;
		 	System.out.println(y);
		 	x++;
		 }


		
	}
}
