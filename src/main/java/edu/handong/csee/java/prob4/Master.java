package edu.handong.csee.java.prob4; //package name
import java.util.Scanner; //imported the following

public class Master //class is made
{
	public void feed(Pet pet) //a method is made
	{
		System.out.println("feed: " + pet.food()); //prints out the following
	}

	public static void main(String[] args) //main method
	{
		String cat_name, dog_name; //string type instance variables
		Master master = new Master(); //instantiating the master as master
		Cat cat = new Cat(); //instantiating the cat as cat
		Dog dog = new Dog();//instantiating the dog as dog

		Scanner keyboard = new Scanner(System.in); //instantiating the scanner as keyboard
		System.out.print("Enter the cat name and dog name: "); //prints out the following

		cat_name = keyboard.next(); //gets the value from the user then inserted to cat name
		dog_name = keyboard.next();//gets the value from the user then inserted to dog name
		
		cat.setName(cat_name); //calls the method of cat
		cat.getName(); //calls the method of cat

		master.feed(cat); //calls the method of master with the value cat as the input


		dog.setName(dog_name);//calls the method of dog with the value dog name as the input
		dog.getName();//calls the method of dog

		master.feed(dog);//calls the method of master with the value dog as the input
	}

}


