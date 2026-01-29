/*
 *	Author: Meghan Chiu
 *  Date: 10/19
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int b = 0;
    System.out.println("Would you like to play the computer? (yes, no, done)");
    String x = sc.nextLine();
    if(x.equalsIgnoreCase("yes")){
        System.out.println("\n\n----------------------------------");
        System.out.println("Please enter rock/paper/scissors: ");
        String person = sc.nextLine();
        compare2("\n"+person);
    }
    else if(x.equalsIgnoreCase("no")){
        System.out.println("How many times would you like the computer to play itself?");
        b = sc.nextInt();
        playitself(b);
        
    }
    else if(x.equalsIgnoreCase("done")){
        System.out.println("\nThanks for playing!");
    }
    else
    System.out.println("Sorry, thats not an option.");
    }
    public static String getObject(){
    int y = (int)(Math.random()*3+1);
    String compgen = "";
    if(y==1){
        compgen = "rock";
    }
    else if(y==2){
        compgen = "paper";
    }
    else{
        compgen = "scissors";
    }
    return compgen;
    }
    public static void compare2(String person){
        String compgen=getObject();
        if(person==compgen){
            System.out.println("You tied!");
        }
        else if((person.equals("scissors"))&&(compgen.equals("rock"))){
            System.out.println("You lost! :(");
        }
        else if((person.equals("paper"))&&(compgen.equals("scissors"))){
            System.out.println("You lost! :(");
        }
        else if((person.equals("rock"))&&(compgen.equals("paper"))){
            System.out.println("You lost! :(");
        }
        else{
            System.out.println("You won!!");
        }
        return;
    }
    public static void playitself(int b){
        int a=0;
        int onewins=0;
        int twowins=0;
        int tied=0;
        String compgen1 = "";
        String compgen2 = "";
        while(a<b){
            int ran1=(int)(Math.random()*3+1);
            if(ran1==1){
                 compgen1 = "rock";
             }
            else if(ran1==2){
                compgen1 = "paper";
            }
            else{
                compgen1 = "scissors";
            }
            int ran2=(int)(Math.random()*3+1);
            if(ran2==1){
                compgen2 = "rock";
            }
            else if(ran2==2){
                compgen2 = "paper";
            }
            else{
                compgen2 = "scissors";
            }
        if(compgen1==compgen2){
            tied=tied+1;
        }
        else if((compgen1.equals("scissors"))&&(compgen2.equals("rock"))){
            twowins=twowins+1;
        }
        else if((compgen1.equals("paper"))&&(compgen2.equals("scissors"))){
            twowins=twowins+1;
        }
        else if((compgen1.equals("rock"))&&(compgen2.equals("paper"))){
            twowins=twowins+1;
        }
        else{
            onewins=onewins+1;
        }
            a=a+1;
        }
        System.out.println("Player one wins: "+onewins);
        System.out.println("Player two wins: "+twowins);
        System.out.println("Ties: "+tied);
        return;
    }
}
