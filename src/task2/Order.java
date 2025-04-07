package task2;

import java.util.ArrayList;

public class Order {
    private ArrayList<Orderable> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(Orderable item) {
        items.add(item);
    }

    public void removeItem(int id) {
        items.removeIf(item -> item.getId() == id);
    }

    public double calculateTotal() {
        double total = 0;
        for (Orderable item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void displayOrderDetails() {
        System.out.println("\nCurrent Order:");
        if (items.isEmpty()) {
            System.out.println("No items in the order.");
        } else {
            for (Orderable item : items) {
                item.displayItemInfo();
            }
            System.out.printf("Total: $%.2f\n", calculateTotal());
        }
    }
}