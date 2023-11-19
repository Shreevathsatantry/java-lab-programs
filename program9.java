import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class program9 extends JFrame {

    private JTextField textField1, textField2, textField3;

    public program9() {
        // Set up the frame
        setTitle("Number Input App");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the components
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        textField3 = new JTextField(10);

        JLabel label1 = new JLabel("Number 1:");
        JLabel label2 = new JLabel("Number 2:");
        JLabel label3 = new JLabel("Number 3:");

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAndDisplay();
            }
        });

        // Set up the layout
        setLayout(new GridLayout(4, 2));

        // Add components to the frame
        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(label3);
        add(textField3);
        add(new JLabel()); // Empty label for spacing
        add(calculateButton);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void calculateAndDisplay() {
        try {
            // Get input values
            double num1 = Double.parseDouble(textField1.getText());
            double num2 = Double.parseDouble(textField2.getText());
            double num3 = Double.parseDouble(textField3.getText());

            // Calculate sum, average, and largest
            double sum = num1 + num2 + num3;
            double average = sum / 3;
            double largest = Math.max(Math.max(num1, num2), num3);

            // Display the results in a dialog box
            String resultMessage = String.format("Sum: %.2f\nAverage: %.2f\nLargest: %.2f", sum, average, largest);
            JOptionPane.showMessageDialog(this, resultMessage, "Results", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new program9();
            }
        });
    }
}
