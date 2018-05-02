package edu.handong.csee.java.prob3;//package name

public class Rectangle extends Shape { //a class that inherits the shape
	private double length; //instance var
	private double width; //instance var

	public Rectangle(double length, double width) //constructor
	{
		this.length = length; //input length is put into the following
		this.width = width; //input width is put into the following
	}

	public double area() //method is made 
	{
		return length * width;//returns the following
	}

	public double perimeter() //method is made 
	{
		return 2*(length+width); //returns the following
	}

	public double get_Length() //method is made 
	{
		return length; //returns the follwoing
	}

	public double get_Width() //method is made 
	{
		return width; //returns the following
	}

}

