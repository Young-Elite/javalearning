// NewAccount.java
// Account class Assignment 3.11

 /*
 *Olatunji Israel Oladotun
 *Friday 25th July 2025
 *02:47
 */
 
 public class NewAccount {
	
	private String name;
	private double balance;
	
	// Constructor
	public NewAccount(String name,double balance) {
		this.name = name;
		
		if (balance > 0.0)
		this.balance = balance;
	}
	
	// Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	//Getter for name
	public String getName() {
		return name;
	}
	
	//Setter for Deposit
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) 
			balance = balance + depositAmount;
	}
	
	//Setter for Withdraw
	public void withdraw(double withdrawAmount) {
		if (withdrawAmount > balance) 
			System.out.println("Insufficient funds");
		else
			balance = balance - withdrawAmount;
	}
	
	//getter for Balance
	public double getBalance() {
		return balance;
	}
	
		
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }