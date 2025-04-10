// Operations.java
// A program for performing basic operations
/*
*Olatunji Israel Oladotun
*Wednesday 09th April 2024
*09:29pm
*/

import java.util.Scanner;

public class Operations {
	public static void main(String[] args) {

		System.out.println("Welcome to my Java program. Two numbers will be entered and basic operations are going to be performed");
		System.out.println("");
	
		
		// Variable declaration
		Scanner input = new Scanner(System.in);

		int number1; // variable to store the first number
		int number2; // variable to store the second number
		int sum, difference, product, division , modulus ; //variable to store the result of the arithmetic operations
		

		System.out.print("Enter the first number: "); //prompt
		number1 = input.nextInt(); //Read the first number from the user

		System.out.print("Enter the second number: "); //prompt
		number2 = input.nextInt(); //Read the second number

		sum = number1 + number2; // Add the two numbers then stores the result in sum
		difference = number1 - number2; //Find the difference between the two numbers and stores the result in difference
		product = number1 * number2; //Multiplies the two numbers then the result is stored in product
		division = number1 / number2; // Divides the first number by the second number and stores the result in division
		modulus = number1 % number2 ;
				

		System.out.printf("The sum of %d and %d is %d%n", number1 ,number2, sum);
		System.out.printf("The difference of %d and %d is %d%n", number1 ,number2, difference);
		System.out.printf("The product of %d and %d is %d%n", number1 ,number2, product);
		System.out.printf("The first number \"%d\" divided by the second number '%d' is %d r %d%n", number1 ,number2, division,  modulus);

	} //End method main
} // End class Operations 
