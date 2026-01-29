/*
   * Author: Meghan Chiu
   * Date: 12/11/25
   * Collaborator(s):
*/
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence.");
		String x = sc.nextLine();
		
		String word = "";
		String letter = "";
		String letter2 = "";
		while(x.indexOf(" ")!=-1){
			word = x.substring(0, x.indexOf(" "));
			letter = x.substring(0, 1);
			if((letter.equalsIgnoreCase("a"))||(letter.equalsIgnoreCase("e"))||(letter.equalsIgnoreCase("i"))||(letter.equalsIgnoreCase("o"))||(letter.equalsIgnoreCase("u"))){
				System.out.print(word+"-way ");
			}
			else{
				letter2=x.substring(1,2);
				if((letter2.equalsIgnoreCase("a"))||(letter2.equalsIgnoreCase("e"))||(letter2.equalsIgnoreCase("i"))||(letter2.equalsIgnoreCase("o"))||(letter2.equalsIgnoreCase("u"))){
					System.out.print(word.substring(1)+"-"+letter+"ay ");
				}
				else{
					System.out.print(word.substring(2)+"-"+letter+letter2+"ay ");
				}
			}
			x=x.substring(x.indexOf(" ")+1);
		}
		letter = x.substring(0, 1);
		if((letter.equalsIgnoreCase("a"))||(letter.equalsIgnoreCase("e"))||(letter.equalsIgnoreCase("i"))||(letter.equalsIgnoreCase("o"))||(letter.equalsIgnoreCase("u"))){
				System.out.print(x+"-way");
			}
		else{
			letter2=x.substring(1,2);
			if((letter2.equalsIgnoreCase("a"))||(letter2.equalsIgnoreCase("e"))||(letter2.equalsIgnoreCase("i"))||(letter2.equalsIgnoreCase("o"))||(letter2.equalsIgnoreCase("u"))){
				System.out.print(x.substring(1)+"-"+letter+"ay");
			}
			else{
				System.out.print(x.substring(2)+"-"+letter+letter2+"ay");
			}
		}
	
}
}