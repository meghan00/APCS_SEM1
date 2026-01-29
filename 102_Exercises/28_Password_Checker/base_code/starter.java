import java.util.*;
import java.io.*;
import java.util.Scanner.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
        int eight = 0;
        int special = 0;
        int both = 0;
        int none = 0;
        int a = 0;
        String character = "";
        while(a<passwords.length){
            character=passwords[a];
		    if(passwords[a].length()>=8){
		        eight++;
		        if((character.contains("!"))||(character.contains("@"))||(character.contains("#"))||(character.contains("$"))||(character.contains("%"))||(character.contains("^"))||(character.contains("&"))||(character.contains("*"))){
		            both++;
		        }
		    }
		    else if((character.contains("!"))||(character.contains("@"))||(character.contains("#"))||(character.contains("$"))||(character.contains("%"))||(character.contains("^"))||(character.contains("&"))||(character.contains("*"))){
		        special++;
		    }
		    else{
		        none++;
		    }
		a++;
        }
		System.out.println("There are "+(eight-both)+" passwords of strength 1 with 8 or more characters.");
		System.out.println("There are "+special+" passwords of strength 2 with a special symbol.");
		System.out.println("There are "+both+" passwords of strength 3 with both strength 1 and 2.");
		System.out.println("There are "+none+" passwords of strength 0 with no strength.");
		
		
	}
}
