/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int x = (int)(Math.random()*149+51);
		int [] one = new int[x];
		int y = 0;
		while(y<x){
			one[y] = (int)(Math.random()*100+1);
			y++;
		}
		int min=Integer.MAX_VALUE;
		int max=0;
		double average = 0.0;
		for(int a=0; a<one.length; a++){
			if(one[a]<min){
				min=one[a];
			}
			if(one[a]>max){
				max=one[a];
			}
			average=average+one[a];
		}
		average = average/one.length;
		System.out.println("Minimum : "+min);
		System.out.println("Maximum : "+max);
		System.out.println("Average : "+average);
		System.out.println("Array size : "+x);
	
		   
		


		
	}
}
