/*
 *	Author: Meghan
 *  Date: 9/29/2025
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter one of the three - animal, object, or face: ");
		String x=sc.nextLine();
		while(true){
		if(x.equalsIgnoreCase("Animal"))
		{
			System.out.println("Here's an elephant!");
			System.out.println("    ___");
			System.out.println(" .--()°' '");
			System.out.println("'|, . ,'");
			System.out.println(" !_-(_|");
		}

		else if(x.equalsIgnoreCase("Object"))
		{
			System.out.println("Here's a sword!");
			System.out.println("-|-----");
		}

		
		else if(x.equalsIgnoreCase("Face"))
		{
			System.out.println("Here's your face!");
			System.out.println("  __   __");
			System.out.println("   .    .");
			System.out.println("      ^ .");
			System.out.println("     ____");
		}

		else{
			System.out.println("That was not an option. Please enter animal, object, or face: ");
			
		}
		x=sc.nextLine();
		}
		
	}
}
