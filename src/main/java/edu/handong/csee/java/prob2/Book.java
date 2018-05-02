package edu.handong.csee.java.prob2;// package name

public class Book { //class named book is made
	private static int idCount = 0; //intance var 
	private String BookName; //instance var
	private int id; //instance var
	
	public Book(String Name) //constructor named book is made
	{
		this.BookName = Name; //the input name is set as the this.bookname
		idCount++; //then idcount is added with 1
		id = idCount; //the new idcounts value is inserted to id
	}
	
	public String toString() // a method is made
	{
		return "\n\tId: " + id + "\n\tBook Name: " + BookName; // returns the following
	}
	
	public void show() // the following method is made
	{
		System.out.println("<<<BOOK>>>" + this.toString()); //prints out the following
	}

}



