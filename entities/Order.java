package entities;

import java.util.ArrayList;

public class Order {
    private ArrayList<ProductInOrder> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public ArrayList<ProductInOrder> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<ProductInOrder> products) {
        this.products = products;
    }

    public float getTotalPrice() {
        float totalPrice = 0.0f;
        for (ProductInOrder product : products) {
            totalPrice += product.getTotalPrice() * product.getQuantity();
        }
        return totalPrice;
    }
}