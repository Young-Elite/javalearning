//NewAccountTest.java
// Main class

/*
*Olatunji Israel Oladotun
*Friday 25th July 2025
*2:59
*/
import java.util.Scanner;
public class NewAccountTest {
	public static void main(String[] args) {
	
	NewAccount Account1 = new NewAccount("Israel Olatunji" , 35.90);
	NewAccount Account2 = new NewAccount("Joe Olatunji" , 70.50);
	
	
	System.out.printf("%s Account balance: #%.2f%n", Account1.getName() , Account1.getBalance());
	System.out.printf("%s Account balance: #%.2f%n", Account2.getName() , Account2.getBalance());

	System.out.print("Enter the deposit Amount: ");
	Scanner input = new Scanner(System.in);
	double amount = input.nextInt();
	Account1.deposit(amount);
	System.out.printf("%s Account balance: #%.2f%n", Account1.getName() , Account1.getBalance());
	System.out.printf("%s Account balance: #%.2f%n", Account2.getName() , Account2.getBalance());	
	
	System.out.print("Enter the Withdrawal Amount: ");
	amount = input.nextInt();
	Account2.withdraw(amount);
	System.out.printf("%s Account balance: #%.2f%n", Account1.getName() , Account1.getBalance());
	System.out.printf("%s Account balance: #%.2f%n", Account2.getName() , Account2.getBalance());














	}
}	
