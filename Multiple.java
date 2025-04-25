// Multiple.java
// A Program to check if a number is a multiple of the other number
/*
*Olatunji Israel Oladotun
*Monday 14th April 2025
*01:46am
*/

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {

		System.out.println("This is a multiple checking program.");

		//Initialization
		Scanner input = new Scanner(System.in);

		//Variable Declaration
		int number1;
		int number2;

		System.out.println("Enter First number: ");
		number1 = input.nextInt(); 

		System.out.println("Enter Second number: ");
		number2 = input.nextInt();

		int modulus;
		modulus = number2 % number1;

		if (modulus == 0)
		System.out.printf("The first number '%d' is a multiple of the second number '%d'.%n", number1 , number2 );

		if (modulus != 0)
		System.out.printf("The first number '%d' is not a multiple of the second number '%d'.%n", number1 , number2 );

	} // End method main
} //End class Multiple