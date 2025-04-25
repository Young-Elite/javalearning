// OddOrEven.java
// A Program to check Even and Odd number
/* 
*Olatunji Israel Oladotun
*Monday 14th April 2025
*00:06am
*/

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {

	System.out.print("Welcome to Odd or Even Program Checker.\n\n");

	// Initialization
	Scanner input = new Scanner(System.in);

	// Variable declaration
	int number;
	int remainder;

	

	System.out.print("Enter a number: "); //Prompt
	number = input.nextInt(); // Get the number from the user

	remainder = number % 2; // Using the remainder operator to determine whether the number is odd or even.
	
	if (remainder == 1)
	System.out.printf("The number \"%d\" is an Odd number.", number);

	if (remainder == 0)
	System.out.printf("The number \"%d\" is an Even number.", number);

	} // End method main
} // End class OddOrEven
