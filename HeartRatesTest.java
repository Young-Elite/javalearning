// HeartRatesTest.java
// Test class for HeartRates

import java.util.Scanner;
import java.time.LocalDate;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for user input
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = input.nextInt();

        System.out.print("Enter your birth day: ");
        int birthDay = input.nextInt();

        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        // Get today's date
        LocalDate today = LocalDate.now();
        int currentDay = today.getDayOfMonth();
        int currentMonth = today.getMonthValue();
        int currentYear = today.getYear();

        // Create HeartRates object
        HeartRates person = new HeartRates(firstName, lastName, birthMonth, birthDay, birthYear);

        // Display info
        System.out.println("\n--- Health Information Summary ---");
        System.out.printf("Name: %s %s%n", person.getFirstName(), person.getLastName());
        System.out.printf("Date of Birth: %d/%d/%d%n", person.getMonth(), person.getDay(), person.getYear());
        System.out.printf("Age: %d years%n", person.getAge(currentDay, currentMonth, currentYear));
        System.out.printf("Maximum Heart Rate: %d bpm%n", person.getRate(currentDay, currentMonth, currentYear));
        System.out.println(person.getRange(currentDay, currentMonth, currentYear));
    }
}
 
