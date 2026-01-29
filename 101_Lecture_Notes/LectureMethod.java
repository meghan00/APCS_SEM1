/* 
    Lecture note example - Methods
*/
import java.util.Scanner;

class LectureMethod{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Number 2: ");
        int num2 = sc.nextInt();
        
        int num1Squared = (squared(num1));
        System.out.println(num1Squared);
        
        int num1Absolute = (absolute(num1));
        System.out.println(num1Absolute);
        System.out.println(absolute(num2));
	}
	public static int squared(int a){
	    int answer = a*a;
	    return answer;
	}
	public static int absolute(int a){
	    if(a<0){
	        return a*-1;
	    }
	    else{
	        return a;
	    }
	}
}