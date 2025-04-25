// task1.java
// A program to find the sum, average, largest , smallest and product of three numbers.
/*
*Olatunji Israel Oladotun
*Sunday 13th April 2025
*2:12pm 
*/

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("Welcome to my Java program. ");

		System.out.print("Enter first number: ");
		// Initialization
		Scanner input = new Scanner(System.in);
		
		int num1,	
		    num2,
		    num3;

		num1 = input.nextInt();

		System.out.print("Enter second number: ");
		num2 = input.nextInt();

		System.out.print("Enter third number: ");
		num3 = input.nextInt();	

		int sum,
                    average,
                    product,
		    smallest,
		    largest;
		
		sum = num1 + num2 + num3;
		average = ((num1 + num2 + num3)/3);
		product = num1 * num2 * num3;

		smallest = num1;
		if (num2 < smallest)
		smallest = num2;
		if (num3 < smallest)
		smallest = num3;

		largest = num1;
		if (num2 > largest)
		largest = num2;
		if (num3 > largest)
		largest = num3;	
	
		System.out.print("Calculations. ");
		System.out.printf("\n\nThe sum of the three numbers is %d.%n" , sum);
		System.out.printf("The average of the three numbers is %d.%n" , average);
		System.out.printf("The product of the three numbers is %d.%n" , product);
		System.out.printf("The smallest number is %d.%n" , smallest);
		System.out.printf("The largest number is %d.%n" , largest);

		

	} // End main method
} // End class task1 
