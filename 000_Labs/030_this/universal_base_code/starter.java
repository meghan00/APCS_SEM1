/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	public static int randAge(){
		int x = (int)(Math.random()*1000);
		return x;
	}
	

	public static void main(String args[]) {
		int a = 0;
		PooleDwarf one = new PooleDwarf(randName(), randAge());
		PooleDwarf two = new PooleDwarf(randName(), randAge());
		PooleDwarf three = new PooleDwarf(randName(), randAge());
		PooleDwarf four = new PooleDwarf(randName(), randAge());
		PooleDwarf five = new PooleDwarf(randName(), randAge());
		PooleDwarf six = new PooleDwarf(randName(), randAge());
		PooleDwarf seven = new PooleDwarf(randName(), randAge());
		
		if(one.isSameName(two.getName())){
			a=a+1;
		}
		if(one.isSameName(three.getName())){
			a=a+1;
		}
		if(one.isSameName(four.getName())){
			a=a+1;
		}
		if(one.isSameName(five.getName())){
			a=a+1;
		}
		if(one.isSameName(six.getName())){
			a=a+1;
		}
		if(one.isSameName(seven.getName())){
			a=a+1;
		}
		
		System.out.println(one.getName()+ " was the name with "+a+" matches.");
	}
}
