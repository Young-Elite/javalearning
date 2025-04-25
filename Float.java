// Float.java
// Area, circumfernce and diameter of a circle program
/*
*Olatunji Israel Oladotun
*Monday 14th April 2025
*02:42am
*/

import java.util.Scanner;

public class Float {
	public static void main(String[] args) {
		System.out.println("Welcome to Circle Arena.");

		// Initialization
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius of the circle: ");		//prompt
		int r; // radius
		r = input.nextInt(); //Get the radius from the user

		System.out.printf("The diameter of the circle is %d.%n", (2 * r));
		System.out.printf("The circumference of the circle is %f.%n", (2 * Math.PI * r));
		System.out.printf("The Area of the circle is %f.%n", (Math.PI * r * r));
		
	} // End method main
} // End class Float 
