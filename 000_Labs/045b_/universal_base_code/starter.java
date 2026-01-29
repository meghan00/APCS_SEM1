/*
 *	Author: Meghan Chiu 
 *  Date: 1/21/25
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a word that you'd like to hide in a crossword: ");
		String word = sc.nextLine();
		int length = word.length()+5;
		String [][] puzzle = new String [length][length];
		
		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
        for(int r = 0; r<puzzle.length; r++){
			for(int c = 0; c<puzzle[0].length; c++){
				puzzle[r][c]= letters[(int)(Math.random()*letters.length)];
			}
		}
		int way = (int)(Math.random()*3);
		int direction = (int)(Math.random()*2);
		
		if(direction==0){ //forward
		int x = (int)(Math.random()*6);
		int y = (int)(Math.random()*6);
			if(way==0){ //vertical
		System.out.println("F Vertical");
				for(int r = x; word.length()>0; r++){
					puzzle[r][y]=word.substring(0,1);
					word=word.substring(1);
				}
			}
			else if(way==1){ //horizontal
		System.out.println("F Horizontal");
				for(int c = y; word.length()>0; c++){
					puzzle[x][c]=word.substring(0,1);
					word=word.substring(1);
				}
			}
		else{ //diagonal
		System.out.println("F Diagonal");
		int r = x;
			for(int c = y; word.length()>0; c++){
					puzzle[r][c]=word.substring(0,1);
					word=word.substring(1);
					r++;
				}
			}
			
		}
		else{ //backward
		int x = (int)(Math.random()*6+(word.length()-1));
		int y = (int)(Math.random()*6+(word.length()-1));
			if(way==0){ //vertical
		System.out.println("B Vertical");
			for(int r = x; word.length()>0; r--){
					puzzle[r][y]=word.substring(0,1);
					word=word.substring(1);
				}
			}
			else if(way==1){ //horizontal
		System.out.println("B Horizontal");
				for(int c = y; word.length()>0; c--){
					puzzle[x][c]=word.substring(0,1);
					word=word.substring(1);
				}
			}
			else{ //diagonal
				System.out.println("B Diagonal");
				int r = x;
				for(int c = y; word.length()>0; c--){
					puzzle[r][c]=word.substring(0,1);
					word=word.substring(1);
					r--;
				}
			}
		}
		
		System.out.println("-----Crossword Puzzle-----");
		for(int r = 0; r<puzzle.length; r++){
			for(int c = 0; c<puzzle[0].length; c++){
				System.out.print(puzzle[r][c]+" ");
			}
			System.out.println();
		}
		
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/
	}
}
