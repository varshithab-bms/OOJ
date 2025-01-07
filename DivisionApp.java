import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisionApp {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Integer Division Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create components
        JLabel num1Label = new JLabel("Num1:");
        JTextField num1Field = new JTextField(10);

        JLabel num2Label = new JLabel("Num2:");
        JTextField num2Field = new JTextField(10);

        JButton divideButton = new JButton("Divide");
        JLabel resultLabel = new JLabel("Result: ");

        // Add action listener to the button
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse the numbers from the text fields
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    // Perform division
                    int result = num1 / num2;

                    // Display the result
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException nfe) {
                    // Handle non-integer inputs
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ae) {
                    // Handle division by zero
                    JOptionPane.showMessageDialog(frame, "Division by zero is not allowed.", "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Arrange components in a panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(divideButton);
        panel.add(resultLabel);

        // Add panel to frame
        frame.add(panel);

        // Set frame visibility
        frame.setVisible(true);
    }
}
