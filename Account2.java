//Account2.java
// Testing the class Account

/*
*Olatunji Israel Oladotun
*23:37
*/

import java.util.Scanner;

public class Account2 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	Account myAccount = new Account();	
	System.out.printf("The name in the Account is %s%n", myAccount.getName());

	//Prompt
	System.out.print("Please Enter your name: ");	
	String yourName = input.nextLine();

	myAccount.setName(yourName);

	System.out.printf("The name in the Account is %s%n", myAccount.getName());

	
	}
} 
