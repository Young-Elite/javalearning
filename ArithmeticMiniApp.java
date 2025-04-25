import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArithmeticMiniApp extends JFrame implements ActionListener {

    // Components
    private JTextField num1Field, num2Field, num3Field;
    private JButton calculateButton;
    private JTextArea resultArea;

    public ArithmeticMiniApp() {
        setTitle("Arithmetic Mini App");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Input Fields
        add(new JLabel("Enter first integer:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Enter second integer:"));
        num2Field = new JTextField();
        add(num2Field);

        add(new JLabel("Enter third integer:"));
        num3Field = new JTextField();
        add(num3Field);

        // Button
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);

        // Result area
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea));

        // Display the frame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int num3 = Integer.parseInt(num3Field.getText());

            int sum = num1 + num2 + num3;
            int average = sum / 3;
            int product = num1 * num2 * num3;

            int smallest = Math.min(num1, Math.min(num2, num3));
            int largest = Math.max(num1, Math.max(num2, num3));

            String equalityMessage;
            if (num1 == num2 && num2 == num3) {
                equalityMessage = "All three numbers are equal.";
            } else if (num1 == num2 || num1 == num3 || num2 == num3) {
                equalityMessage = "Two numbers are equal.";
            } else {
                equalityMessage = "All numbers are different.";
            }

            // Show results
            resultArea.setText(
                "Sum: " + sum + "\n" +
                "Average: " + average + "\n" +
                "Product: " + product + "\n" +
                "Smallest: " + smallest + "\n" +
                "Largest: " + largest + "\n" +
                equalityMessage
            );
        } catch (NumberFormatException ex) {
            resultArea.setText("Please enter valid integers!");
        }
    }

    public static void main(String[] args) {
        new ArithmeticMiniApp();
    }
}
 
