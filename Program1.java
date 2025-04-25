// CarPoolSavingsCalculator.java
// Car-Pool Savings Calculator!
/*
* Olatunji Israel Oladotun
* Saturday 19th April 2025
* 00:29am
*/

import java.util.Scanner;

public class CarPoolSavingsCalculator {
    public static void main(String[] args) {
        
        // Welcome message
        System.out.println("Welcome to the Car-Pool Savings Calculator!");
        
        // Initialize scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter total miles driven per day: ");
        double milesDriven = input.nextDouble();
        
        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = input.nextDouble();
        
        System.out.print("Enter average miles per gallon (MPG): ");
        double milesPerGallon = input.nextDouble();
        
        System.out.print("Enter parking fees per day: ");
        double parkingFees = input.nextDouble();
        
        System.out.print("Enter tolls per day: ");
        double tollsPerDay = input.nextDouble();
        
        // Calculate daily fuel cost
        double fuelCostPerDay = (milesDriven / milesPerGallon) * costPerGallon;
        
        // Calculate total daily driving cost
        double totalDrivingCost = fuelCostPerDay + parkingFees + tollsPerDay;
        
        // Display the results
        System.out.printf("Your daily driving cost is: $%.2f%n", totalDrivingCost);
        
        // Suggest savings if carpooling
        System.out.print("How many people will carpool with you? ");
        int carpoolCount = input.nextInt();
        
        // Calculate potential savings per person if carpooling
        double savingsPerPerson = totalDrivingCost / carpoolCount;
        System.out.printf("Potential savings per person when carpooling: $%.2f%n", savingsPerPerson);
        
        // Close the scanner to avoid resource leak
        input.close();
    }
}
