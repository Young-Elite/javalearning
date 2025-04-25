//  FiveNumbers.java
// A program to calculate squares and cubes of number from 0 to 10
/*
*Olatunji Israel Oladotun
*Friday 18th April 2025
*04:58am
*/

import java.util.Scanner;

public class FiveNumbers {
	public static void main(String[] args) { 

	System.out.println("Welcome to Numbers Check!\n");
	
	// Initialization
	Scanner input = new Scanner(System.in);

	// Variable declaration
	int number1;
	int number2;
	int number3;
	int number4;
	int number5;

	System.out.println("Enter first number:");
	number1 = input.nextInt(); 

	System.out.println("Enter second number:");
	number2 = input.nextInt(); 

	System.out.println("Enter third number:");
	number3 = input.nextInt(); 

	System.out.println("Enter fourth number:");
	number4 = input.nextInt(); 

	System.out.println("Enter fifth number:");
	number5 = input.nextInt(); 



	System.out.println("Checking the numbers\n");

	if (number1 == 0)
	    zero1 = number1;
	if (number1 > 0)
	    positive1 = number1;
	if (number1 < 0)
	    negative1 = number1;
	if (number2 == 0)
	    System.out.println("The second number is 0");	
	
	if (number3 == 0)
	    System.out.println("The third number is 0");

	if (number4 == 0)
	    System.out.println("The fourth number is 0");

	if (number5 == 0)
	    System.out.println("The fifth number is 0");

	



	} // End method main
} // End class FiveNumbers 
