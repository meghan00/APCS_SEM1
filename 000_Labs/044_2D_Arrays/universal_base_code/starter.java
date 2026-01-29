/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		System.out.println("The integer 2d array has 4 rows and 3 columns.");
		System.out.println("The 2D array is the following:");
		int [][] x = new int[4][3];
		for(int r = 0; r<x.length; r++){
			for(int c = 0; c<x[0].length; c++){
				x [r][c]=(int)(Math.random()*5);
				System.out.print(x[r][c]+" ");
			}
			System.out.println("");
		}


		
	}
}
