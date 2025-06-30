package ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import ui.AddProducts;

public class MainUI extends JFrame implements ActionListener {
    // static ShoppingCart cart;
    private JRadioButton smartphoneSelector;
    private JRadioButton laptopSelector;
    private JRadioButton tabletsSelector;
    private JButton shoppingCartButton;
    private JLabel label;

    public MainUI() {
        // Create the first panel
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(5, 1, 50, 50));

        ShoppingCart cart = new ShoppingCart();
        cart.setVisible(false);

        smartphoneSelector = new JRadioButton("Smartphones");
        laptopSelector = new JRadioButton("Laptops");
        tabletsSelector = new JRadioButton("Tablets");

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(smartphoneSelector);
        group.add(laptopSelector);
        group.add(tabletsSelector);

        shoppingCartButton = new JButton("Shopping Cart");
        label = new JLabel("Categories:");

        panel1.add(label);
        panel1.add(smartphoneSelector);
        smartphoneSelector.addActionListener((ActionListener) this);
        panel1.add(laptopSelector);
        laptopSelector.addActionListener((ActionListener) this);
        panel1.add(tabletsSelector);
        tabletsSelector.addActionListener((ActionListener) this);
        panel1.add(shoppingCartButton);

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
        if (e.getSource() == smartphoneSelector) {
            label.setText("Category selected: " + smartphoneSelector.getText());
        } else if (e.getSource() == laptopSelector) {
            label.setText("Category selected: " + laptopSelector.getText());
        } else if (e.getSource() == tabletsSelector) {
            label.setText("Category selected: " + tabletsSelector.getText());
        }
    }

    public static void main(String[] args) {
        MainUI mainUI = new MainUI();
    }
}
