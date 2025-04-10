// ArithmeticOperations.java 
// Performing basic arithmetic operation
/*
*Olatunji Israel Oladotun
*Wednesday 09th April 2024
*19:39pm
*/

import java.util.Scanner;`

public class ArithmeticOperations {
	public static void main(String[] args) {
		
		// Variable Declaration		
		Scanner input = new Scanner(System.in);

		int number1;
		int number2;
		int sum,
		    difference,
		    multiplication;
			
		
		System.out.print("Enter first number: "); // Prompt to read first number from user
		number1 = input.nextInt();
		System.out.print("Enter second number: "); // Prompt to read second number from user
		number2 = input.nextInt();

		sum = number1 + number2;
		difference = number1 - number2;
		multiplication = number1 * number2;

		System.out.printf("The sum of %d and %d is %d%n", number1 ,number2, sum ); 
 		System.out.printf("The difference of %d and %d is %d%n", number1 ,number2, difference);
		System.out.printf("The product of %d and %d is %d%n", number1 ,number2, multiplication);

	} // End Method main
} // End Class ArithmeticOperations
