// DigitSeperator.java
// This program seperates numbers into single digit 
/*
*Olatunji Israel Oladotun
*Monday 14th April 2025
*10:50am
*/

import java.util.Scanner;

public class DigitSeperator {
	public static void main(String[] args) {
		System.out.println("Enter a Number: ");

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		int     digit1,
			digit2,
			digit3,
			digit4,
			digit5;

		digit1 = number/10000;
		digit2 = number % 10000 / 1000;
		digit3 = number % 1000 / 100;
		digit4 = number % 100 / 10;
		digit5 = number % 10 / 1;

		 System.out.printf("%d   %d   %d   %d   %d%n", digit1, digit2, digit3, digit4, digit5);

	} //End main method
}// End class