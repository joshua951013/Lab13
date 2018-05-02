package edu.handong.csee.java.prob6;//package name

public class Printer { //class is made
	public static void print(Object object) //a method is made
	{

		String str = object.toString(); //sets the str with the input

		if(object instanceof CapitalPrintable) //if statement 

			str = str.toUpperCase(); //for str equals the str.toUpperCase

		System.out.println(str); //prints out str

	}





}

