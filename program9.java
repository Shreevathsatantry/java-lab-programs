import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class program9 {
    private JTextField textField1, textField2, textField3;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            program9 app = new program9();
            app.createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Number Calculation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        textField3 = new JTextField(10);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new CalculateButtonListener());

        panel.add(new JLabel("Number 1:"));
        panel.add(textField1);
        panel.add(new JLabel("Number 2:"));
        panel.add(textField2);
        panel.add(new JLabel("Number 3:"));
        panel.add(textField3);
        panel.add(calculateButton);

        frame.getContentPane().add(panel);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                double num3 = Double.parseDouble(textField3.getText());

                double sum = num1 + num2 + num3;
                double average = sum / 3;
                double max = Math.max(Math.max(num1, num2), num3);

                String resultMessage = String.format("Sum: %.2f\nAverage: %.2f\nLargest: %.2f", sum, average, max);

                JOptionPane.showMessageDialog(null, resultMessage, "Result", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid floating-point numbers.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}