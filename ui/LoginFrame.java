package ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton;
    MainUI mainUI = new MainUI();
    RegisterFrame rFrame = new RegisterFrame();

    public LoginFrame() {
        mainUI.setVisible(false);
        rFrame.setVisible(false);

        setTitle("Login Frame");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 1));
        add(panel);

        JLabel usernameLabel = new JLabel("Username");
        panel.add(usernameLabel);

        usernameField = new JTextField(20);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password");
        panel.add(passwordLabel);

        passwordField = new JPasswordField(20);
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener((ActionListener) this);
        panel.add(loginButton);

        registerButton = new JButton("Register");
        registerButton.addActionListener((ActionListener) this);
        panel.add(registerButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (e.getSource() == loginButton) {
            if (username.equals("admin") && password.equals("password")) {
                JOptionPane.showMessageDialog(this, "Login successful");
                this.dispose();
                mainUI.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password");
            }
        }
        if (e.getSource() == registerButton) {
            this.dispose();
            rFrame.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}