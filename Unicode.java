//Unicode.java
// A program to test and know Unicode characters
/*
*Olatunji Israel Oladotun
*Monday 14th April 2025
*10:28am
*/

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {

	// Displaying integer eqivalent of character

	System.out.printf("The character %c has the value %d.%n", 'A', (int) 'A');
	System.out.printf("The character %c has the value %d.%n", 'B', (int) 'B');
        System.out.printf("The character %c has the value %d.%n", 'C', (int) 'C');
        System.out.printf("The character %c has the value %d.%n", 'a', (int) 'a');
        System.out.printf("The character %c has the value %d.%n", 'b', (int) 'b');
        System.out.printf("The character %c has the value %d.%n", 'c', (int) 'c');
        System.out.printf("The character %c has the value %d.%n", '0', (int) '0');
        System.out.printf("The character %c has the value %d.%n", '1', (int) '1');
        System.out.printf("The character %c has the value %d.%n", '2', (int) '2');
        System.out.printf("The character %c has the value %d.%n", '$', (int) '$');
        System.out.printf("The character %c has the value %d.%n", '*', (int) '*');
        System.out.printf("The character %c has the value %d.%n", '+', (int) '+');
        System.out.printf("The character %c has the value %d.%n", '/', (int) '/');
        System.out.printf("The character (blank space) has the value %d.%n", (int) ' ');

	System.out.print("\n\nCheck other Character's integer equivalent.\n ");
	Scanner input = new Scanner(System.in);

        System.out.print("Enter any character: ");
        char character = input.next().charAt(0); // reads first character of user input

        int unicodeValue = (int) character;

        System.out.printf("The character '%c' has the Unicode value: %d%n", character, unicodeValue);

	} // End main method
} // End class Unicode
