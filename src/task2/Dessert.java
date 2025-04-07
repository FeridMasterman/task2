package task2;

public class Dessert extends MenuItem {
    private boolean isCold;

    public Dessert(int id, String name, String description, double price, boolean isCold) {
        super(id, name, description, price);
        this.isCold = isCold;
    }

    @Override
    public void displayItemInfo() {
        System.out.println("Dessert: " + getName() + " - " + getDescription() +
                " | Served Cold: " + (isCold ? "Yes" : "No") + " | $" + getPrice());
    }
}