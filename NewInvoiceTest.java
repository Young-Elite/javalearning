//NewInvoiceTest.java
// Main class

/*
*Olatunji Israel Oladotun
*Friday 25th July 2025
*2:59
*/

import java.util.Scanner;

public class NewInvoiceTest {
	public static void main(String[] args) {
		
		NewInvoice Invoice1 = new NewInvoice();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Part Number: ");
		String partNumber = input.nextLine();
		Invoice1.setPartNumber(partNumber);
		
		System.out.print("Enter the Part Description: ");
		String partDescription = input.nextLine();
		Invoice1.setPartDescription(partDescription);
		
		System.out.print("Enter the Part Quantity: ");
		int partQuantity = input.nextInt();
		Invoice1.setPartQuantity(partQuantity);
		
		System.out.print("Enter the Price: ");
		double pricePerItem = input.nextDouble();
		Invoice1.setPricePerItem(pricePerItem);
		
		System.out.print("Product Details \n\n");
		System.out.printf("Part Number: %s%n" , Invoice1.getPartNumber());
		System.out.printf("Part Description: %s%n" , Invoice1.getPartDescription());
		System.out.printf("Part Quantity: %d%n" , Invoice1.getPartQuantity());
		System.out.printf("Price per item: %f%n" , Invoice1.getPricePerItem());
		System.out.printf("Invoice Amount: %f%n" , Invoice1.getInvoiceAmount());
		
				
	}
}
