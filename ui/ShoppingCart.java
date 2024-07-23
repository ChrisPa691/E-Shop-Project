package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ShoppingCart extends JFrame {
  private JPanel topPanel;
  private JPanel bottomPanel;
  private ProductInOrderPanel itemList;
  private JScrollPane scrollPane;
  private JButton button1, button2;

  public ShoppingCart() {
    setTitle("Shopping Cart");
    setLayout(new BorderLayout());

    topPanel = new JPanel();
    bottomPanel = new JPanel();

    scrollPane = new JScrollPane(itemList);
    add(scrollPane, BorderLayout.CENTER);

    button1 = new JButton("Procced Order");
    button2 = new JButton("Remove All");
    bottomPanel.setLayout(new FlowLayout());
    bottomPanel.add(button1);
    bottomPanel.add(button2);
    add(bottomPanel, BorderLayout.SOUTH);

    setSize(400, 300);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    ArrayList<String> items = new ArrayList<>();
    items.add("item 1");
    items.add("item 2");
    items.add("item 3");

  }
}