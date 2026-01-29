/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
	Spiderman one = new Spiderman();
	one.setActor("Sophia");
	one.setAge(15);
	one.setVillian("Ms. Yang");
	System.out.println(one.getActor());
	System.out.println(one.getAge());
	System.out.println(one.getVillain());
	one.fight();
	one.printArt();
	Spiderman two = new Spiderman("Tobey Maguire", 48, "Green Goblin");
	System.out.println(two.getActor());
	System.out.println(two.getAge());
	System.out.println(two.getVillain());
	Spiderman three = new Spiderman("Andrew Garfield", 40);
	three.setVillian("Electro");
	System.out.println(three.getActor());
	System.out.println(three.getAge());
	System.out.println(three.getVillain());
	Spiderman four = new Spiderman(27);
	four.setActor("Tom Holland");
	four.setVillian("The Vulture");
	System.out.println(four.getActor());
	System.out.println(four.getAge());
	System.out.println(four.getVillain());
	}
}
