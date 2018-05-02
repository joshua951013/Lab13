package edu.handong.csee.java.prob2; //package name

public class Science extends Book { //a class that inherits the book
	private String publisher; //string type instance var
	
	public Science(String Name, String Publisher) //constructor is made
	{
		super(Name); //super's name, puts the input name 
		this.publisher = Publisher; //the input publisher is inserted 
	}

	public String toString() //a method is made 
	{
		return super.toString() + "\n\tPublisher: " + publisher; //returns the following
	}

	public void show() // a method is made
	{
		System.out.println("<<<Science>>>" + this.toString()); //prints the following
	}
}

