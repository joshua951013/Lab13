package edu.handong.csee.java.prob3; //package name 

public abstract class Shape { //abstract class shape is made 
	public abstract double area(); // abstract double type area is declared
	public abstract double perimeter(); // abstract double type perimeter is declared
	
	public void display() //a method is made 
	{
		System.out.println("Area: "+area()+"\nPerimeter: "+perimeter() +"\n"); //prints out the following
	}
}


