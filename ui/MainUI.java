package ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainUI extends JFrame implements ActionListener {
    // static ShoppingCart cart;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JButton button;
    private JLabel label;

    public MainUI() {
        // Create the first panel
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(5, 1, 50, 50));

        ShoppingCart cart = new ShoppingCart();
        cart.setVisible(false);

        radioButton1 = new JRadioButton("Smartphones");
        radioButton2 = new JRadioButton("Laptops");
        radioButton3 = new JRadioButton("Tablets");

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        button = new JButton("Shopping Cart");
        label = new JLabel("Categories:");

        panel1.add(label);
        panel1.add(radioButton1);
        radioButton1.addActionListener((ActionListener) this);
        panel1.add(radioButton2);
        radioButton2.addActionListener((ActionListener) this);
        panel1.add(radioButton3);
        radioButton3.addActionListener((ActionListener) this);
        panel1.add(button);

        // Create the second panel
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3, 3));

        // Add 9 buttons to the second panel
        for (int i = 0; i < 9; i++) {
            panel2.add(new JButton("Button " + (i + 1)));
        }

        // Add both panels to the window
        add(panel1);
        add(panel2);

        setTitle("MainUI");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(1, 2));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == radioButton1) {
            label.setText("Category selected: " + radioButton1.getText());
        } else if (e.getSource() == radioButton2) {
            label.setText("Category selected: " + radioButton2.getText());
        } else if (e.getSource() == radioButton3) {
            label.setText("Category selected: " + radioButton3.getText());
        }
    }

    public static void main(String[] args) {

    }
}
