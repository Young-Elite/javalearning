//Operators.java
//Operators program 
//relational and equality operators
/*
*Olatunji Israel Oladotun
*Sunday 6th April 2025
*08:10pm
*/

import java.util.Scanner;

public class Operators
{
	public static void main(String[] args)
	{
		//Variable Declaration
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;

			System.out.print("Enter first number:");
			number1 = input.nextInt();
			System.out.print("Enter second number:");
			number2 = input.nextInt();

			if (number1 == number2)
			;
			System.out.printf("%d == %d%n", number1, number2);

			if (number1 != number2)
			;
			System.out.printf("%d != %d%n", number1, number2);

			if (number1 >= number2)
			System.out.printf("%d >= %d%n", number1, number2);

	} //End method main
} // End class Operators
