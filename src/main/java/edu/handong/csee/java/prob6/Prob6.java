package edu.handong.csee.java.prob6;//package name

public class Prob6 { //a class is made
	
	public static void main(String[] args) { //main method
		UpPoint p1 = new UpPoint(3,3); //instantiating uppoint as p1 with the given value
		DownPoint p2 = new DownPoint(2,5);//instantiating downpoint as p1 with the given value
		DownPoint p3 = new DownPoint(4,7);//instantiating uppoint as p1 with the given value
		UpPoint p4 = new UpPoint(9,12);//instantiating uppoint as p1 with the given value

		Printer.print(p1); //calling print method from printer with p1 value
		Printer.print(p2);//calling print method from printer with p2 value
		Printer.print(p3);//calling print method from printer with p3 value
		Printer.print(p4);//calling print method from printer with p4 value
	}

}

