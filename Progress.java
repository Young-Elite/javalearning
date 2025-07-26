import javax.swing.JOptionPane;

public class Progress{
	public static void main(String[] args){
	
	
		String name = JOptionPane.showInputDialog("What is your Name: ");
		
		String message =String.format("Welcome , %s, Welcome to Java",name);
		
		JOptionPane.showMessageDialog(null, message);
	
	
	
	}
}