/*
 *	Author: Meghan Chiu 
 *  Date: 1/14/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rows would you like for your 2D array?");
		int r = sc.nextInt();
		System.out.println("How many columns would you like for your 2D array?");
		int c = sc.nextInt();
		System.out.println("---------------------------------------");
		int [][] x = new int[r][c];
		for(int r2 = 0; r2<x.length; r2++){
			for(int c2 = 0; c2<x[0].length; c2++){
				x [r2][c2]=(int)(Math.random()*10+1);
				System.out.print(x[r2][c2]+" ");
			}
			System.out.println("");
		}
		System.out.println("---------------------------------------");
		System.out.println("What row would you like to get the average of?");
		int row = sc.nextInt();
		double average = 0.0;
		for(int i = 0; i<x[0].length; i++){
				average=average+x[row][i];
		}
		System.out.println("The row average is "+average/x[0].length);
		average=0.0;
		for(int a = 0; a<x.length; a++){
			for(int b=0; b<x.length; b++){
				average=average+x[a][b];
			}
		}
		System.out.println("The average of the 2d array is "+average/x[0].length);

		
	}
}
