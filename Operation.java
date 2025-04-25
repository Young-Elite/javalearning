// Operation.java
// Program used to Calculate Addition, Subtraction, Multiplication , and Division of two numbers.
/*
*Olatunji Israel Oladotun
*Friday 11th April 2025
*23:57 
*/

import java.util.Scanner;

public class Operation {
	public static void main(String[] args) {

		System.out.println("Welcome"); //Greeting message

		System.out.print("Enter the first number: "); //prompt

			// Initialization
			Scanner input = new Scanner(System.in);

			int num1;
			num1 = input.nextInt(); // Get first number

		System.out.print("Enter the second number: "); //prompt

			int num2; 
			num2 = input.nextInt(); // Get second number


			int add, sub, div, mul;

			add = num1 + num2; // Addition of two numbers
			sub = num1 - num2; // Difference of two numbers
			mul= num1 * num2; // Product of the two numbers
			div = num1 / num2; //Divides the first number by the second number

		System.out.printf("The sum of the first number \"%d\" and the second number \"%d\" is %d%n", num1, num2 , add); //Print the result of addition
		System.out.printf("The difference of the first number \"%d\" and the second number \"%d\" is %d%n", num1, num2 , sub); //Print the result of Difference
		System.out.printf("The first number \"%d\" multiplied with the second number \"%d\" is %d%n", num1, num2 , mul); //Print the result of Multiplication
		System.out.printf("The first number \"%d\" divided by the second number \"%d\" is %d%n", num1, num2 , div); //Print the result of Division

			
	} // End method main

} //End class Operation
 
