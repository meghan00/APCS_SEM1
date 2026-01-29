/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
	int [] one = new int [20];
	System.out.println("----------------------------------------------------");
	System.out.println("These are the 20 numbers");
	for(int i = 0; i<one.length; i++){
		one[i]=(int)(Math.random()*(10-1)+1);
		System.out.print(one[i]+" ");
	}
	System.out.println("\n----------------------------------------------------");
	
	int duplicate = 0;
	int y = (int)(Math.random()*(10-1)+1);
	System.out.println("The random number to look for is "+y);
	for(int i = 0; i<one.length; i++){
		if(y==one[i]){
		duplicate++;
		System.out.println("Duplicate found at index "+i);
		}
	}
	System.out.println("The total number of duplicates for "+y+" is "+duplicate);
	System.out.println("----------------------------------------------------");
	
	System.out.println("Looking for two in a row:");
	for(int i = 0; i<one.length-1; i++){
		if(one[i+1]==one[i])
		System.out.println("Two in a row found at indexes "+i+" and "+(i+1)+". The number is "+one[i]);
	}
//	if(one[one.length]==one[one.length-1]){
//		System.out.println("Two in a row found at indexes "+one.length-1+" and "+one.length+". The number is "+one[one.length]);
//	}
}
}
