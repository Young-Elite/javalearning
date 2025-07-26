// Date.java
// Learning Java
/*
*Olatunji Israel Oladotun
*Sunday 20 April 2025
*01:32am
*/ 


public class Date {
	//Instance Variables
	private int month;
	private int day;
	private int year;
	
	//No argument constructor
	public Date() {
		this.month = 0;
		this.day = 0;
		this.year = 0;
	}
	
	//Constructor
	public Date(int month, int day, int year){
		this.month = month;
		this.day = day;
		this.year = year;
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
	
	//Getter for Date Display
	public String displayDate() {
		 return String.format("%d / %d / %d ", month, day, year);
	}
	
	
}

