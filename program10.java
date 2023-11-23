import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class program10 extends JFrame {

    public program10() {
        setTitle("User Information Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Create components
        String[] cities = {"Select City", "New York", "London", "Tokyo", "Paris"};
        JComboBox<String> cityComboBox = new JComboBox<>(cities);

        JTextField nameTextField = new JTextField(20);
        JTextField phoneNumberTextField = new JTextField(20);

        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        JCheckBox readingCheckBox = new JCheckBox("Reading");
        JCheckBox sportsCheckBox = new JCheckBox("Sports");
        JCheckBox musicCheckBox = new JCheckBox("Music");

        JButton submitButton = new JButton("Submit");

        // Create layout
        setLayout(new GridLayout(7, 2));
        add(new JLabel("City:"));
        add(cityComboBox);
        add(new JLabel("Name:"));
        add(nameTextField);
        add(new JLabel("Phone Number:"));
        add(phoneNumberTextField);
        add(new JLabel("Gender:"));
        add(maleRadioButton);
        add(new JLabel(""));
        add(femaleRadioButton);
        add(new JLabel("Hobbies:"));
        add(readingCheckBox);
        add(sportsCheckBox);
        add(musicCheckBox);
        add(new JLabel(""));
        add(submitButton);

        // Add ActionListener to the submitButton
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display user selections in an alert
                String city = (String) cityComboBox.getSelectedItem();
                String name = nameTextField.getText();
                String phoneNumber = phoneNumberTextField.getText();
                String gender = maleRadioButton.isSelected() ? "Male" : "Female";
                StringBuilder hobbies = new StringBuilder("Hobbies: ");
                if (readingCheckBox.isSelected()) {
                    hobbies.append("Reading ");
                }
                if (sportsCheckBox.isSelected()) {
                    hobbies.append("Sports ");
                }
                if (musicCheckBox.isSelected()) {
                    hobbies.append("Music");
                }

                String message = "City: " + city + "\n" +
                        "Name: " + name + "\n" +
                        "Phone Number: " + phoneNumber + "\n" +
                        "Gender: " + gender + "\n" +
                        hobbies.toString();

                JOptionPane.showMessageDialog(program10.this, message, "User Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new program10().setVisible(true);
            }
        });
    }
}

