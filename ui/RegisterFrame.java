package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegisterFrame extends JFrame {
    private JLabel fullNameLabel;
    private JTextField fullNameTextField;
    private JLabel emailLabel;
    private JTextField emailTextField;
    private JLabel usernameLabel;
    private JTextField usernameTextField;
    private JLabel passwordLabel;
    private JTextField passwordTextField;
    private JLabel dateOfBirthLabel;
    private JTextField dateOfBirthTextField;
    private JLabel addressLabel;
    private JTextField addressTextField;
    private JLabel mobilePhoneNumberLabel;
    private JTextField mobilePhoneNumberTextField;
    private JCheckBox newsletterCheckBox;
    private JButton registerButton;

    public RegisterFrame() {
        setSize(600, 600);
        setLayout(new GridLayout(9, 2));

        fullNameLabel = new JLabel("Fullname:");
        fullNameTextField = new JTextField(20);

        emailLabel = new JLabel("Email:");
        emailTextField = new JTextField(20);

        usernameLabel = new JLabel("Username:");
        usernameTextField = new JTextField(20);

        passwordLabel = new JLabel("Password:");
        passwordTextField = new JTextField(20);

        dateOfBirthLabel = new JLabel("Date of Birth:");
        dateOfBirthTextField = new JTextField(20);

        addressLabel = new JLabel("Address:");
        addressTextField = new JTextField(20);

        mobilePhoneNumberLabel = new JLabel("Phone:");
        mobilePhoneNumberTextField = new JTextField(20);

        newsletterCheckBox = new JCheckBox("I agree to the terms and conditions");

        registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // Do something with the customer object
                System.out.println();
            }
        });

        add(fullNameLabel);
        add(fullNameTextField);
        add(emailLabel);
        add(emailTextField);
        add(usernameLabel);
        add(usernameTextField);
        add(passwordLabel);
        add(passwordTextField);
        add(dateOfBirthLabel);
        add(dateOfBirthTextField);
        add(addressLabel);
        add(addressTextField);
        add(mobilePhoneNumberLabel);
        add(mobilePhoneNumberTextField);
        add(newsletterCheckBox);
        add(registerButton);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }

    public static void main(String[] args) {

    }

}
