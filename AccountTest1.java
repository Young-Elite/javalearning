// AccountTest1.java
// A program --------
/* 
*Olatunji Israel Oladotun
*Sunday 20th April 2025
*15:28
*/

import java.util.Scanner;
public class AccountTest1 {
	public static void main(String[] args){
			
		Account account1 = new Account("Mary jane",35.75);
		Account account2 = new Account("Delight Favour" , -7.45);
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s Account Balance: #%.2f%n",account1.getName(), account1.getBalance());
		System.out.printf("%s Account Balance: #%.2f%n",account2.getName(), account2.getBalance());
		
		System.out.print("How much deposit(Account1): ");
		String n1= input.nextLine();
		account1.setName(n1) ;    

		System.out.print("How much deposit(Account2): ");
		String n2=input.nextLine();
		account2.setName(n2);  
		
		
		
		System.out.printf("%s Account Balance: #%.2f%n",account1.getName(), account1.getBalance());
		System.out.printf("%s Account Balance: #%.2f%n",account2.getName(), account2.getBalance());

		System.out.print("How much deposit(Account1): ");
		double depositAmount = input.nextDouble();
		account1.deposit(depositAmount);

		System.out.print("How much deposit(Account2): ");
		depositAmount = input.nextDouble();
		account2.deposit(depositAmount);
		
		System.out.printf("%s Account Balance: #%.2f%n",account1.getName(), account1.getBalance());
		System.out.printf("%s Account Balance: #%.2f%n",account2.getName(), account2.getBalance());
	
	}

}
