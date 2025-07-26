//JAddition.java
//An Addition GUI

/*
*Olatunji Israel Oladotun
*Friday 25th July 2025
*05:00 am
*/

import javax.swing.JOptionPane;
public class JAddition{
	public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null , "Welcome to Addition GUI");
	String number1 = JOptionPane.showInputDialog("Enter the first number: ");
	
	String number2 = JOptionPane.showInputDialog("Enter the second number: ");
	
	int Addition = Integer.parseInt(number1) + Integer.parseInt(number2);
	
	String message = String.format("The addition of %s and %s is %d%n", number1, number2, Addition);
	JOptionPane.showMessageDialog(null , message);
	
	
	}

}
