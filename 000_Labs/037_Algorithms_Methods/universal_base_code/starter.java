/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int [] one = new int[100];
		randomizeArray(one);
		toStringArray(one);
		System.out.println("Average : "+getArrayAverage(one));
		System.out.println("Maximum : "+getArrayMax(one));
		System.out.println("Minimum : "+getArrayMin(one));
		
		
	}
	
	public static void randomizeArray(int [] x){
		int y = 0;
		while(y<x.length){
			x[y] = (int)(Math.random()*100+1);
			y++;
		}
	}
	
	public static int getArrayAverage(int [] x){
		int average = 0;
		for(int i = 0; i<x.length; i++){
			average = average + x[i];
		}
		average=average/x.length;
		return average;
	}
	
	public static void toStringArray(int [] x){
		for(int i=0; i<x.length; i++){
			System.out.println(x[i]);
		}
	}
	
	public static int getArrayMax(int [] x){
		int max = 0;
		for(int i = 0; i<x.length; i++){
			if(x[i]>max){
				max=x[i];
			}
		}
		return max;
	}
	
	public static int getArrayMin(int [] x){
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<x.length; i++){
			if(x[i]<min){
				min=x[i];
			}
		}
		return min;
	}
	
}

