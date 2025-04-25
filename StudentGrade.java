// A program to calculate Student Grade
/*
*Olatunji Israel Oladotun
*Thursday 10th April 2025
*09:15am 
*/

import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		int grade, score ;
		
		System.out.println("Welcome to Scholarly Academy.");
		System.out.print("Enter your grade: ");	
		grade = input.nextInt();
		score = grade / 10;

		System.out.printf("The student score is %d%n", score);

		if (score >= 7)
		System.out.println("Your grade is A, An Excellent Grade");

		if (score == 6)
		System.out.println("Your grade is B, Very Good Grade");
		
		if (score == 5)
		System.out.println("Your grade is C, Good Grade");

		if (score <= 4)
		System.out.println("Poor Grade , You can do better.");

	} //End method main
} //End class StudentGrade