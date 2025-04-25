// Comparison.java
// A Program to compare two numbers together
/*
*Olatunji Israel Oladotun
*Sunday 13th April 2025
*01:46pm
*/

import java.util.Scanner;

public class Comparison {
	public static void main(String[] args) {

		System.out.println("Welcome to Comparison program.");

		System.out.print("Enter first number: "); //prompt

		//Initialization
		Scanner input = new Scanner(System.in);
		
		// Declaring variables
		int num1;
		num1 = input.nextInt();

		System.out.print("Enter second number: "); //prompt
		// Declaring variables
		int num2;
		num2 = input.nextInt();

		if (num1 > num2) 
		System.out.printf("The first number \"%d\" is larger than the second number \"%d\".%n", num1 ,num2);

		if (num1 < num2) 
		System.out.printf("The second number \"%d\" is larger than the first number \"%d\".%n", num2 ,num1);

		if (num1 == num2) 
		System.out.printf("The first number \"%d\" is equal to the second number \"%d\".%n", num1 ,num2);

		System.out.println("End of Comparison program.");

	} // End main mathod
} // End class Comparison 
