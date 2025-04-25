// CheckNumber.java
// This program checks the largest and smallest number in the group.
/*
*Olatunji Israel Oladotun
*Sunday 13th April 2025
*09:26pm
*/

import java.util.Scanner;

public class CheckNumber {
	public static void main(String[] args) {
	
		System.out.println("Welcome to Check Number Program.");
		
		// Initialization
		Scanner input = new Scanner(System.in);

		int num1,	// First number by user
		    num2,	// Second number by user
		    num3,	// Third number by user
		    num4, 	// Fourth number by user
		    num5;	// Fifth number by user

		System.out.print("Enter the first number: ");
		num1 = input.nextInt();

		System.out.print("Enter the second number: ");
		num2 = input.nextInt();

		System.out.print("Enter the third number: ");
		num3 = input.nextInt();

		System.out.print("Enter the fourth number: ");
		num4 = input.nextInt();
		
		System.out.print("Enter the fifth number: ");
		num5 = input.nextInt();

		int smallest;
		smallest = num1; 	// Making number one the smallest

		if (num2 < smallest)
		   smallest = num2;	// if num2 is less than num1, make num2 the smallest

		if (num3 < smallest)
		    smallest = num3;
	
		if (num4 < smallest)
		    smallest = num4;

		if (num5 < smallest)
		    smallest = num5;	

		int largest;
		largest = num1; 	// Making number one the largest

		if (num2 > largest)
		   largest = num2;	// if num2 is greater than largest, make num2 the largest

		if (num3 > largest)
		    largest = num3;
	
		if (num4 > largest)
		    largest = num4;

		if (num5 > largest)
		    largest = num5;	

		System.out.printf("The smallest number is %d.%n", smallest);
		System.out.printf("The largest number is %d.%n", largest);

	} // End main method
} // End class CheckNumber
