// Eligibility.java
// Program to check eligibility of voter
/*
*Olatunji Israel Oladotun
*Thursday 09th April 2025
*12:07pm
*/


import java.util.Scanner;

public class Eligibility {
	public static void main(String[] args) {
		
		//Variable declaration
		Scanner input = new Scanner(System.in);

		int age;

		System.out.println("Welcome to Eligibility platform.");
		System.out.print("Please enter your Age: ");
		age = input.nextInt();

		if ( age == 18) 
		System.out.println("You are now eligible to vote"); 		
		
		if ( age > 18) 
		System.out.println("You are eligible to vote"); 

		if ( age < 18) 
		System.out.println("You are not eligible to vote."); 

	} //End method main
} //End class Eligibility
