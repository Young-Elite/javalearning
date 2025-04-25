// FiveNumbers.java
// A program to check and count if each number is positive, negative, or zero
/*
 * Olatunji Israel Oladotun
 * Friday 18th April 2025
 * 04:58am
 */

import java.util.Scanner;

public class FiveNumbers {
    public static void main(String[] args) {

        System.out.println("Welcome to Numbers Check!\n");

        // Initialization
        Scanner input = new Scanner(System.in);

        // Variable declaration
        int number1, number2, number3, number4, number5;

        // Count variables
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();
        if (number1 == 0) {
            System.out.println("The first number is 0");
            zeroCount++;
        }
        if (number1 > 0) {
            System.out.println("The first number is a positive number");
            positiveCount++;
        }
        if (number1 < 0) {
            System.out.println("The first number is a negative number");
            negativeCount++;
        }

        System.out.print("Enter second number: ");
        number2 = input.nextInt();
        if (number2 == 0) {
            System.out.println("The second number is 0");
            zeroCount++;
        }
        if (number2 > 0) {
            System.out.println("The second number is a positive number");
            positiveCount++;
        }
        if (number2 < 0) {
            System.out.println("The second number is a negative number");
            negativeCount++;
        }

        System.out.print("Enter third number: ");
        number3 = input.nextInt();
        if (number3 == 0) {
            System.out.println("The third number is 0");
            zeroCount++;
        }
        if (number3 > 0) {
            System.out.println("The third number is a positive number");
            positiveCount++;
        }
        if (number3 < 0) {
            System.out.println("The third number is a negative number");
            negativeCount++;
        }

        System.out.print("Enter fourth number: ");
        number4 = input.nextInt();
        if (number4 == 0) {
            System.out.println("The fourth number is 0");
            zeroCount++;
        }
        if (number4 > 0) {
            System.out.println("The fourth number is a positive number");
            positiveCount++;
        }
        if (number4 < 0) {
            System.out.println("The fourth number is a negative number");
            negativeCount++;
        }

        System.out.print("Enter fifth number: ");
        number5 = input.nextInt();
        if (number5 == 0) {
            System.out.println("The fifth number is 0");
            zeroCount++;
        }
        if (number5 > 0) {
            System.out.println("The fifth number is a positive number");
            positiveCount++;
        }
        if (number5 < 0) {
            System.out.println("The fifth number is a negative number");
            negativeCount++;
        }

        // Display the final count summary
        System.out.println("\nSummary of Inputs:");
        System.out.println("Total positive numbers: " + positiveCount);
        System.out.println("Total negative numbers: " + negativeCount);
        System.out.println("Total zeros: " + zeroCount);

       // Close Scanner
	input.close();
    } // End method main
} // End class FiveNumbers
