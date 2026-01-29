/*
 *	Author: Meghan Chiu
 *  Date: 11/13/25
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		String[] tvChars = {
			"Walter White", "Jesse Pinkman", "Saul Goodman", "Rick Grimes",
			"Eleven", "Michael Scott", "Dwight Schrute", "Jim Halpert",
			"Leslie Knope", "Ron Swanson", "Ted Lasso", "BoJack Horseman",
			"Homer Simpson", "Bart Simpson", "Peter Griffin", "Stewie Griffin",
			"Sheldon Cooper", "Geralt (Netflix)", "Wednesday Addams", "Joe Goldberg"
		};
		System.out.println("--------------LEFT SHIFT 1-------------------");
		System.out.println("---------------------------------------------");
		printArray(tvChars);
		System.out.println("\n---------------------------------------------");
		leftShift(tvChars);
		printArray(tvChars);
		System.out.println("\n---------------------------------------------");

		System.out.println("-------------LEFT SHIFT MANY-----------------");
		printArray(tvChars);
		System.out.println("\n---------------------------------------------");
		leftShift(tvChars, 5);
		printArray(tvChars);
		System.out.println("\n---------------------------------------------");

	}

	public static void printArray(String[] arr){
		for(int i=0; i<arr.length-1; i++){
			System.out.print(arr[i]+", ");
		}
		System.out.print(arr[arr.length-1]);
	}

	public static void leftShift(String [] arr){
		String x=arr[0];
		for(int i = 0; i<arr.length-1; i++){
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]= x;
	}

	public static void leftShift(String [] arr, int num){
		int a = 0;
		while(a<num){
			String x=arr[0];
			for(int i = 0; i<arr.length-1; i++){
			arr[i]=arr[i+1];
			}
			arr[arr.length-1]= x;
			a++;
		}
	}
}
