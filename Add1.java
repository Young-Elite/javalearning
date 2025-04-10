// Add1.java
// Addition Program to add numbers together
/*
*Olatunji Israel Oladotun
*Saturday 5th April 2025
*06:39am
*/ 

import java.util.Scanner; // program uses class Scanner

public class Add1
{
	// Main method 
	public static void main(String[] args)
	{
		// Variable Declaration
		Scanner input = new Scanner(System.in);

		int number1; // First number to add
		int number2; // Second number to add
		int sum; // Sum of the two numbers

		System.out.println("Enter the first number:");
		number1 = input.nextInt(); // read first number from the user

		System.out.println("Enter the second number:");
		number2 = input.nextInt(); //read the second number from the user

		sum = number1 + number2;
 
		System.out.printf(" Sum is %d%n ", sum);
	} //End main method
} //End class Add1