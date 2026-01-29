/*
 *	Author:  Meghan Chiu
 *  Date: 11/19/25
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard [] x = new Wizard [100];
		Warrior [] y = new Warrior [100];
		for(int i = 0; i<x.length; i++){
			x[i] = new Wizard();
			y[i] = new Warrior();
		}
		int i = 0;
		int a = 0;
		while((x.length-1>i)&&(y.length-1>a)){
			x[i].attack(y[a]);
			if(y[a].isDead()==true){
				a++;
			}
			y[a].attack(x[i]);
			if(x[i].isDead()==true){
				i++;
			}
			
		}
		if(i>0){
			System.out.println("Wizards won with "+(x.length-i)+" left in their army.");
		}
		else if(a>0){
			System.out.println("Warriors won with "+(y.length-a)+" left in their army.");
		}
		
//		while((x[i].getHealth()>0)&&(y[i].getHealth()>0)){
//			x[i].attack(y[i]);
//			y[i].attack(x[i]);
	//	}
	//			if(x[x.length-1].isDead()==true){
	//				System.out.println("Wizards won with "+(x.length-i)+" left in their army.");
	//			}
	//			else if(y[y.length-1].isDead()==true){
	//				System.out.println("Wizard won with "+(y.length-i)+" left in their army.");
	//			}
		}
		
	}
