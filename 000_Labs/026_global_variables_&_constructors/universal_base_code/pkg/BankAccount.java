/*
 *	Author:  Meghan Chiu
 *  Date: 10/22/25
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
private String owner;
private int accountnumber;
private double balance;
private boolean isactive;
private static int nextAccountNumber = (int)(Math.random()*950+50);
	// -------CONSTRUCTORS-------
public BankAccount(){
	owner = "unknown";
	balance = 0;
	isactive = true;
	accountnumber = nextAccountNumber;
	nextAccountNumber=nextAccountNumber+1;
}
public BankAccount(String o){
	owner = o;
	balance = 0;
	isactive = true;
	accountnumber = nextAccountNumber;
	nextAccountNumber=nextAccountNumber+1;
}
public BankAccount(String o, double b){
	owner = o;
	balance = b;
	isactive = true;
	accountnumber = nextAccountNumber;
	nextAccountNumber=nextAccountNumber+1;
}
	// -------METHODS-------
public void printInfo(){
	System.out.println("------------------------------");
	System.out.println("Owner : "+owner);
	System.out.println("Account Number : "+accountnumber);
	System.out.println("Balance : "+balance);
	if(true){
		System.out.println("This account is active.");
	}
	else{
		System.out.println("This account is not active.");
	}
	System.out.println("------------------------------\n");
	
}

}
