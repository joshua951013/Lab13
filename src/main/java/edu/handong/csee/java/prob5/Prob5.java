package edu.handong.csee.java.prob5; //package name
import java.util.Scanner; //imported the following

public class Prob5 { // class is made 

	public static boolean equals(int[][] m1, int[][] m2) //boolean type method is made
	{
		int count = 0; //local
		if (m1.length != m2.length) // if the number of row is different
			return false; //return false

		for (int i = 0; i < m1.length; i++) //for statement i=0 and as i is smaller, increase i by 1(loop)
		{
			for (int j = 0; j < m1[i].length; j++) //for statement for the loop with the following condition
			{
				if (m1[i][j] != m2[i][j]) //if statement for if they are not equal
					count++; //add 1 for count
			}
		}

		if(count <= 3) //if count is less or equal to 3
			return true; //return true
		else //else
			return false; //return false
	}


	public static void main(String[] args) //main method
	{
		int n1, n2 = 0; //instance var

		Scanner keyboard = new Scanner(System.in); //instantiating the scanner as keyboard
		System.out.print("Enter row size(maximum 5): "); //prints out the following
		n1 = keyboard.nextInt(); //reads in the value as n1

		System.out.print("Enter column size(maximum 5): "); //prints out the following
		n2 = keyboard.nextInt(); //reads in the value as n2

		int[][] m1 = new int[n1][n2]; //instantiation as m1

		System.out.print("Enter row size(maximum 5): "); //prints out the following
		n1 = keyboard.nextInt(); //reads in the value as n1

		System.out.print("Enter column size(maximum 5): "); //prints out the following
		n2 = keyboard.nextInt(); //reads in the value as n2

		int[][] m2 = new int[n1][n2]; //instantiation for m2

		System.out.print("Enter List1: "); //prints out the following

		for (int i = 0; i < m1.length; i++) //for statement for the loop with the given condition
			for (int j = 0; j < m1[i].length; j++)//for statement for the loop with the given condition
				m1[i][j] = keyboard.nextInt(); //gets the value as m1

		System.out.print("Enter list2: ");//prints out the follwoing

		for (int i = 0; i < m2.length; i++){ //for statement for the loop with the given condition
			for (int j = 0; j < m2[i].length; j++)//for statement for the loop with the given condition
				m2[i][j] = keyboard.nextInt(); //gets in the value as m2
		}

		for (int i = 0; i < m1.length; i++){//for statement for the loop with the given condition

			for (int j = 0; j < m1[i].length; j++)//for statement for the loop with the given condition

				System.out.print(m1[i][j] + " "); //prints out the following 

			System.out.println();// prints out an empty single line

		}

		System.out.println();// prints out an empty single line

		for (int i = 0; i < m2.length; i++)//for statement for the loop with the given condition
		{
			for (int j = 0; j < m2[i].length; j++)//for statement for the loop with the given condition
				System.out.print(m2[i][j] + " "); //prints out the following
			
			System.out.println(); //prints out a single empty line 
		}

		System.out.println(); //prints out a single empty line

		if (equals(m1, m2)) //if statement as m1 and m2 are equal
			System.out.println("The two arrays are approximately identical."); //prints out the following
		
		else  //else
			System.out.println("The two arrays are not identical"); //prints out the following

	}
}

