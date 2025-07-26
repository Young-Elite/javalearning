//Heartrates.java 
// class with attributes to check Health details

/*
*Olatunji Israel Oladotun
*Saturday 26th July 2025
*04:17am
*/

public class HeartRates { 
	private String firstname;
	private String lastname;
	private int month;
	private int day;
	private int year;
	
	public HeartRates() {
		this.firstname = "";
		this.lastname = "";
		this.month = 0;
		this.day = 0;
		this.year = 0;
	}
	
	public HeartRates(String firstname, String lastname, int month, int day, int year) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	//Setters for firstname
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	
	//Getters for firstname
	public String getFirstName() {
		return firstname;
	}
	
	//Setters for lastname
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	//Getters for firstname
	public String getLastName() {
		return lastname;
	}	
	
	//Setter for month
	public void setMonth(int month) {
		this.month = month;
	}
	
	//Getter for month
	public int getMonth() {
		return month; 
	}
		
	//Setter for Day
	public void setDay(int day) {
		this.day = day;
	}
	
	//Getter for Day
	public int getDay() {
		return day; 
	}
	
	//Setter for Year
	public void setYear(int year) {
		this.year = year;
	}
	
	//Getter for Year
	public int getYear() {
		return year; 
	}
	
	//Getter for Age
	public int getAge(int currentDay, int currentMonth, int currentYear) {
		int age = currentYear - year;
		if (currentMonth < month || currentMonth == month && currentDay < day) 
			age -= 1;
		return age;
	}

	//Getter for max heart rate
	public int getRate(int currentDay, int currentMonth, int currentYear) { 
		return 220 - getAge(currentDay, currentMonth, currentYear);
	}
	
	//Getter for target heart rate range
	public String getRange(int currentDay, int currentMonth, int currentYear) {
		int age = getAge(currentDay, currentMonth, currentYear);
		double upper = (0.85) * (220 - age );
		double lower = (0.50) * (220 - age);
		return String.format("Target heart range: %.2f - %.2f " , lower, upper);
	}


} 