/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog one = new Dog("Penny");
		one.setAge(67);
		Dog two = new Dog("Nickel", "Chimpanzee");
		
		boolean oneBarked = false;
		
		if(one.isSleeping()){
			System.out.println(one.name +" is asleep.");
		}
		else{
			one.bark();
			oneBarked = true;
		}
		
		if(oneBarked){
			two.bark();
		}
		
//		if(!one.isSleeping()){
//			two.bark();
//		}
		
		


	}
}
