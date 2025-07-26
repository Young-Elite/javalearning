// DateTest.Java
// Main class

/*
*Olatunji Israel Oladotun
*Friday 25th July 2025
*01:51am
*/ 

import java.util.Scanner;
public class DateTest {
	public static void main(String[] args) {
		 
	Date myDate = new Date();
	Scanner input = new Scanner(System.in);
	
	System.out.printf("Initial Date: %s " , myDate.displayDate());
	input.nextLine();
	System.out.print("Enter month: ");
	int month = input.nextInt();
	myDate.setMonth(month);

	System.out.print("Enter Day: ");
	int day = input.nextInt();
	myDate.setDay(day);	
	
	System.out.print("Enter Year: ");
	int year = input.nextInt();
	myDate.setYear(year);

	System.out.printf("Date Displayed based on input: %s " , myDate.displayDate());


	}
	
}