// StudentGrade.java

// StudentGrade.java
// A program to calculate Student Grade
/*
*Olatunji Israel Oladotun
*Thursday 10th April 2025
*09:15am 
*/

import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {

		System.out.println("Welcome to Scholarly Academy.");
		System.out.print("Enter your grade: ");	
		

		Scanner input = new Scanner(System.in);
	
		int grade;
		grade = input.nextInt();
		

		if (grade >= 70)
		System.out.println("Your grade is A, An Excellent Grade");

		if (grade >= 60)
		System.out.println("Your grade is B, Very Good Grade");
		
		if (grade >= 50)
		System.out.println("Your grade is C, Good Grade");

		if (grade >= 45)
		System.out.println("Your grade is D, Poor Grade");

		if (grade >= 40)
		System.out.println("Your grade is E, You can do better.");

	} //End method main
} //End class StudentGrade