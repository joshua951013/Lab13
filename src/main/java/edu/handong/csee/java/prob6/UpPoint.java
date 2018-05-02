package edu.handong.csee.java.prob6;//package name

public class UpPoint implements CapitalPrintable { //class that is implemented by capitalprintable is made

	private int x, y; //instance var
	UpPoint(int x, int y){this.x = x; this.y = y;} //sets the uppointer with the given

	public String toString()//a method 
	{
		return "x : " + x + " y : " + y; //returns the following
	}
}

