/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] one = new int[1000];
		 int x = 0;
		 int y = 0;
		 while(x<one.length){
		 	y=y+3;
		 	one[x] = y;
		 	System.out.print(y+", ");
		 	x++;
		 }
		 
		 System.out.println("\n--------------------------------");
		 
		 int [] two = new int[1000];
		 int a = 0;
		 int b = 1000;
		 while(a<two.length){
		 	System.out.print(b+", ");
			b=b-1;
		 	two[a] = b;
		 	a++;
		 }
	}
}
