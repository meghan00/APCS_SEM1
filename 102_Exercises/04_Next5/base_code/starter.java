/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a number: ");
	int quantity1= sc.nextInt();
	System.out.println("Here are the next 5 numbers:");
	System.out.println((quantity1+1)+", "+(quantity1+2)+", "+(quantity1+3)+", "+(quantity1+4)+", "+(quantity1+5));
	System.out.println("Here are the next 5 multiples of "+quantity1+" :");
	System.out.println((quantity1)+", "+(quantity1*2)+", "+(quantity1*3)+", "+(quantity1*4)+", "+(quantity1*5));	
	double quantity2 = quantity1;
	System.out.println("Here is "+quantity1+" divided by 100:");
	System.out.println(quantity2/100);
	System.out.println("Here is "+quantity1+" divided by 10:");
	System.out.println(quantity2/10);

	}
}

