/*
	Author: Meghan Chiu
	Date: 1/12/26
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a word or phrase: ");
		String x = sc.nextLine();
		
		System.out.println("");
		
		String letter = "";
		int a = 0;
		for(int i = 0; i<x.length(); i++){
			letter = x.substring(i, i+1);
			if(letter.equals(" ")){
				a=-1;
			}
			if(a%2==0){
				System.out.print(letter.toLowerCase());
			}
			else{
				System.out.print(letter.toUpperCase());
			}
			a++;
		}
	}
}
