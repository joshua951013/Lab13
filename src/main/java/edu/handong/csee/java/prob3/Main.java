package edu.handong.csee.java.prob3;// package name

import java.util.Scanner; //imports the utils scanner

public class Main { //a class is made

	public static void main(String[] args) { //main method
		double n1, n2; //double type variables

		Scanner keyboard = new Scanner(System.in); //instantiating the scanner as keyboard

		System.out.print("Enter radius: "); //prints the following
		n1 = keyboard.nextDouble(); //the value that is gotten from the user is inserted to n1

		Circle c1 = new Circle(n1); //instantiating the circle as c1 with the value n1 as input

		System.out.println("Radius: "+ c1.get_Radius()); //prints the following

		c1.display(); //calls the following method

		System.out.print("Enter length and width: "); //prints the following
		n1 = keyboard.nextDouble(); //reads in the value from the user and inserted the value to n1
		n2 = keyboard.nextDouble();  //reads in the value from the user and inserted the value to n2

		Rectangle r1 = new Rectangle(n1, n2); //instantiating the rectangle as r1 with the n2,n1 values for the input

		System.out.println("Length: "+ r1.get_Length()); //prints the following
		System.out.println("Width: "+ r1.get_Width()); //prints the following
		r1.display(); //calls the following method

	}

}

