// Employee.java
//Employee class

/*
*Olatunji Israel Oladotun
*Friday 25th July 2025
*17:54
*/ 

public class Employee {
	
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	// No argument constructor
	public Employee() {
		this.firstName = "";
		this.lastName = "";
		this.monthlySalary = 0.0;
	}
	
	//Constructor
	public Employee(String firstName,String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		if (monthlySalary > 0.0)
		this.monthlySalary = monthlySalary;
	}
	
	//Setter for First Name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//Getter for First Name
	public String getFirstName() {
		return firstName;
	}
	
	//Setter for Last Name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//Getter for Last Name
	public String getLastName() {
		return lastName;
	}
	
	//Setter 
	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary > 0.0)
			this.monthlySalary = monthlySalary;
	}
	
	//Getter
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	//Getter
	public double getYearlySalary() {
		return monthlySalary * 12;
	}
	
	//Setter
	public void raise(double raisepercent) {
		monthlySalary = monthlySalary + ((raisepercent/100) * monthlySalary);
	}
	

	
		
}