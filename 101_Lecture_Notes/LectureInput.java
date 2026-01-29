/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double item1price = 17.50;
        double item2price = 18.50;
        double item3price = 18.50;
        System.out.println("🥟 Welcome to 鼎泰丰(dintaifung)! 🥟");
        System.out.println("Here's our menu:");
        System.out.println("🥟 Xiao Long Bao - " + item1price);
        System.out.println("🍲 Braised Beef Noodle Soup - " + item2price);
        System.out.println("🍚 Pork Chop Fried Rice - " + item3price);
        
        System.out.println("Whats the name for the order?");
        String name = sc.nextLine();
        System.out.println();
        
        System.out.println("How many Xiao Long Baos would you like?");
        int quantity1= sc.nextInt();
        System.out.println("How many Noodle Soups would you like?");
        int quantity2= sc.nextInt();
        System.out.println("How many Fried Rices would you like?");
        int quantity3= sc.nextInt();
        
        double total1 = item1price*quantity1;
        double total2 = item2price*quantity2;
        double total3 = item1price*quantity3;
        double currentTotal = total1+total2+total3;
        System.out.println("Your current total is: $" +currentTotal);
        System.out.println("What percent would you like to tip?");
        double tippercent = sc.nextDouble();
        double tip = currentTotal*(tippercent/100);
        double grandtotal = currentTotal+tip;
        System.out.println(" ");
        System.out.println("🧾 Your Receipt:");
        System.out.println(quantity1+" x Xiao Long Bao = "+total1);
        System.out.println(quantity2+" x Braised Beef Noodle Soup = "+total2);
        System.out.println(quantity3+" x Pork Chop Fried Rice = "+total3);
        System.out.println("Tip: "+tippercent+" = $"+tip);
        System.out.println("----------------------------");
        System.out.println("Grand Total = "+grandtotal);
        System.out.println("----------------------------");
        System.out.println("Thanks for dining at 鼎泰丰(dintaifung)!");
	}
}
