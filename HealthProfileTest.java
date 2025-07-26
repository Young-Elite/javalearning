// HealthProfileTest.java
// Prompts user input and displays health profile

/*
*Olatunji Israel Oladotun
*Saturday 26th July 2025
*04:17am
*/

import java.util.Scanner;
import java.time.LocalDate;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for personal info
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter gender: ");
        String gender = input.nextLine();

        System.out.print("Enter birth day (1-12): ");
        int birthDay = input.nextInt();

        System.out.print("Enter birth month (1-12): ");
        int birthMonth = input.nextInt();

        System.out.print("Enter birth year (e.g. 2000): ");
        int birthYear = input.nextInt();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Get today's date
        LocalDate today = LocalDate.now();
        int currentDay = today.getDayOfMonth();
        int currentMonth = today.getMonthValue();
        int currentYear = today.getYear();

        // Create object
        HealthProfile profile = new HealthProfile(
            firstName, lastName, gender,
            birthDay, birthMonth, birthYear,
            height, weight
        );

        // Output summary
        System.out.println("\n==== HEALTH PROFILE SUMMARY ====");
        System.out.printf("Name: %s %s%n", profile.getFirstName(), profile.getLastName());
        System.out.printf("Gender: %s%n", profile.getGender());
        System.out.printf("Date of Birth: %d/%d/%d%n", profile.getBirthDay(), profile.getBirthMonth(), profile.getBirthYear());
        System.out.printf("Height: %.2f inches%n", profile.getHeightInInches());
        System.out.printf("Weight: %.2f pounds%n", profile.getWeightInPounds());

        // Calculations
        int age = profile.getAge(currentDay, currentMonth, currentYear);
        System.out.printf("Age: %d years%n", age);

        System.out.printf("BMI: %.2f%n", profile.getBMI());
        System.out.printf("Maximum Heart Rate: %d bpm%n", profile.getMaxHeartRate(currentDay, currentMonth, currentYear));
        System.out.printf("Target Heart Rate Range: %s%n", profile.getTargetHeartRateRange(currentDay, currentMonth, currentYear));

        profile.displayBMIChart();
    }
}
 
