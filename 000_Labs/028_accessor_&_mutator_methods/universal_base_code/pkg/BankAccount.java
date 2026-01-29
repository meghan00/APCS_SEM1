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
public void displayAccountInfo(){
	System.out.println("--- Account Info ---");
	System.out.println("Owner : "+owner);
	System.out.println("Account Number : "+accountnumber);
	System.out.println("Balance : "+balance);
	
	if(isactive){
		System.out.println("Status : Active.");
	}
	else{
		System.out.println("Status : Not Active.");
	}
	System.out.println("--------------------\n");
}
public void checkBalance(){
	System.out.println("Current Account Balance: $"+balance);
}
public String getOwner(){
	return owner;
}
public double getBalance(){
	return balance;
}
public void setOwner(String o){
	owner = o;
}
public void closeAccount(){
	isactive=false;
}
public void deposit(double d){
	if(isactive){
		balance = balance + d;
	}
}
public void withdraw(double u){
	if(isactive){
		if(u<=balance){
		balance = balance - u;
		}
	}
}
}
