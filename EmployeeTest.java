// EmployeeTest.Java
// Main class

/*
*Olatunji Israel Oladotun
*Friday 25th July 2025
*18:44
*/ 

import java.util.Scanner;
public class EmployeeTest {
	public static void main(String[] args) {
		
		//Employee myEmployee1 = new Employee("Israel", "Olatunji", 550_000.00);
		//Employee myEmployee2 = new Employee("Dave", "Wilson", 100_000.00);
		
		Employee myEmployee1 = new Employee();
		Employee myEmployee2 = new Employee();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first name(EMPLOYEE 1): ");
		String first_name = input.nextLine();
		myEmployee1.setFirstName(first_name);
		
		System.out.print("Enter your last name(EMPLOYEE 1): ");
		String last_name = input.nextLine();
		myEmployee1.setLastName(last_name);
		
		System.out.print("Enter your monthly salary(EMPLOYEE 1): ");
		double monthly_salary = input.nextDouble();
		myEmployee1.setMonthlySalary(monthly_salary);
		
		 input.nextLine(); 
		
		System.out.print("Enter your first name(EMPLOYEE 2): ");
		first_name = input.nextLine();
		myEmployee2.setFirstName(first_name);
		
		System.out.print("Enter your last name(EMPLOYEE 2): ");
		last_name = input.nextLine();
		myEmployee2.setLastName(last_name);
		
		System.out.print("Enter your monthly salary(EMPLOYEE 2): ");
		monthly_salary = input.nextDouble();
		myEmployee2.setMonthlySalary(monthly_salary);
	
	
		System.out.printf("The First Employee %s %s monthly salary is %.2f%n" , myEmployee1.getFirstName() , myEmployee1.getLastName(), myEmployee1.getMonthlySalary());
	
		System.out.printf("The Second Employee %s %s monthly salary is %.2f%n" , myEmployee2.getFirstName() , myEmployee2.getLastName(), myEmployee2.getMonthlySalary());
		
		
		System.out.printf("The First Employee %s %s Yearly salary is %.2f%n" , myEmployee1.getFirstName() , myEmployee1.getLastName(), myEmployee1.getYearlySalary());
	
		System.out.printf("The Second Employee %s %s Yearly salary is %.2f%n" , myEmployee2.getFirstName() , myEmployee2.getLastName(), myEmployee2.getYearlySalary());
		
		System.out.print("How many percent raise(%) for Employee 1: ");
		double percent = input.nextDouble();
		myEmployee1.raise(percent);
		
		System.out.print("How many percent raise(%) for Employee 2: ");
		percent = input.nextDouble();
		myEmployee2.raise(percent);
		
		System.out.printf("The First Employee %s %s Yearly salary is %.2f%n" , myEmployee1.getFirstName() , myEmployee1.getLastName(), myEmployee1.getYearlySalary());
	
		System.out.printf("The Second Employee %s %s Yearly salary is %.2f%n" , myEmployee2.getFirstName() , myEmployee2.getLastName(), myEmployee2.getYearlySalary());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}