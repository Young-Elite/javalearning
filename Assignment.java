//Assignment.java
// Control Structures.
/*
*Sequential
*Selection
*Iterative
*/
/*
*Olatunji Israel Oladotun
*Friday May 16 2025
*10:35am
*/

import java.util.Scanner;

public class Assignment {
	public static void main (String[] args) {

	System.out.println("Am Back!");
	
	System.out.println("The next project is a Grade checker , an advanced type following proper control structure methods unlike the previous improvised method.");
	// Initialization
	Scanner input = new Scanner(System.in); 
	
	int grade;
	System.out.println("Enter Student Grade:");
	grade = input.nextInt();

	if (grade >= 70) {
	    System.out.println("Your grade is A.");
	} else if (grade >=60 ) {
	    System.out.println("Your grade is B.");
	} else if (grade >=50 ) {
	    System.out.println("Your grade is C.");
	} else if (grade >=45 ) {	
	    System.out.println("Your grade is D.");
	} else if (grade >=40 ) {
	    System.out.println("Your grade is E.");
	} else { 
	    System.out.println("Your grade is F.");	
	}

	
	int x , y ;
	System.out.println("Enter the value of x: ");
	x = input.nextInt();

	System.out.println("Enter the value of y: ");
	y = input.nextInt();
	
	if (x > 0 ) {
	    if (y > 0) 
		System.out.println("x and y are positive numbers.");
	     else 
		System.out.println("y is not a positive numbers.");
	}
	else
	   System.out.println("x is not a positive numbers.");

	
	System.out.println(grade >= 50 ? "Passed" : "Failed");

	} // End class main
} // End class Assignment
