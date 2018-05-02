package edu.handong.csee.java.prob2; //package name

public class History extends Book{ // a class that inherits from book is made
	private String Author; //a string type instance var 

	public History(String Name, String Author) // constructor is made
	{
		super(Name); //the super name, the input
		this.Author = Author; // puts that input authors value(?) to this.author
	}

	public String toString() //a method is made
	{
		return super.toString() + "\n\tAuthor: " + Author; //returns the following
	}

	public void show() //a method is made
	{
		System.out.println("<<<History>>>" + this.toString()); //prints out the following
	}
}

