// BMICalculator.java
// A program to check the user Body Mass Index
/*
 * Olatunji Israel Oladotun
 * Friday 18th April 2025
 * 04:58am
*/ 

import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		System.out.println("Welcome to BMI Calculator Program.");

		System.out.print("Enter your weight In Pounds: ");

		// Initialization
		Scanner input = new Scanner(System.in);

		// Variable declaration
		int weightInPounds,
		    heightInInches,
		    result ;

		 weightInPounds = input.nextInt();

		System.out.print("Enter your height In Inches: ");
		heightInInches = input.nextInt();

		result = (weightInPounds * 703) / (heightInInches * heightInInches);

		System.out.printf("Your Body mass index is %d%n", result);

		System.out.println("\n\n\nBMI VALUES.");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal: between 18.5 and 24.9");
		System.out.println("Overweight:between 25 and 29.9 ");
		System.out.println("Obese: 30 or greater.");
		
		
		input.close();		
	} // End method main
} // End class BMICalculator