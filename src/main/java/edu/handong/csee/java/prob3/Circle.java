package edu.handong.csee.java.prob3; //package name

public class Circle extends Shape { //a class that inherits shape
	private double radius; //double type instance var

	public Circle(double r) //constructor 
	{
		radius = r; //puts the input r as radius
	}

	public double area() //method is made
	{
		return Math.PI * Math.pow(radius, 2); // pi * r * r
	}

	public double perimeter() //method is made
	{
		return 2.0 * Math.PI * radius; // 2 * pi * radius
	}

	public double get_Radius() //method is made
	{
		return radius; //returns the following
	}

}

