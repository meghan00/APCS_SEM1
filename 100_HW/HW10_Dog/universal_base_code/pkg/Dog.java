package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	public String name;
	int age;
	String breed;
	public Dog() //Default Constructor
	{
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog(String n) //Name Constructor
	{
		name = n;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String n, String b) //Name & Breed Constructor
	{
		name = n;
		age = 1;
		breed = b;
	}
	public Dog(String n, int a) //
	{
		name = n;
		age = a;
		breed = "dog dog";
	}
	
		/*	Accessor Methods	*/
	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}
	public String getBreed()
	{
		return breed;
	}

	/*	Mutator Methods	*/
	public void setName(String n){
		name = n;
	}
	
	public void setAge(int a){
		age = a;
	}
	public void setBreed(String breed){
		this.breed = breed;
	}
	/*	More Methods	*/
	public boolean isSleeping(){
		int x = (int)(Math.random()*2+1);
		if(x==1){
			boolean sleeping = true;
			return sleeping;
		}
		else{
			boolean sleeping = false;
			return sleeping;
		}
	}
	public void bark(){
		System.out.println(name + " barked!");
	}
	

	
}
