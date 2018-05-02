package edu.handong.csee.java.prob2; //package name

public class Main { //a class is made 
	
	public static void main(String[] args) { //a main method 
		Book book = new Book("Simple Book"); //instantiating the book as book and puts the following values as input

		Science science = new Science("Hello Physics!", "ScienceWorld"); //instantiating science as science the puts following values as the input
		History history1 = new History("What Is history?", "E.H.Carr" );  //instantiating science as science the puts following values as the input

		book.show(); //calls the show method of book
		science.show(); //calls the show method of science 
		history1.show(); //calls the show method of history1
	}
}

