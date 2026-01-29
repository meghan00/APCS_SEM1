/*
 *	Author: Meghan Chiu
 *  Date: 10/21/25
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.taxes();
		michael.employeeToString();
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.raiseSalary(67);
		Dwight.employeeToString();
		Employee jim = new Employee(2474, "Jim", "Halpurt", 4416.66);
		jim.raiseSalary(-1000);
		jim.employeeToString();
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.raiseSalary(1);
		pam.employeeToString();
		
	}
}
