package task2;
public class Appetizer extends MenuItem {
    private String spiceLevel;

    public Appetizer(int id, String name, String description, double price, String spiceLevel) {
        super(id, name, description, price);
        this.spiceLevel = spiceLevel;
    }

    @Override
    public void displayItemInfo() {
        System.out.println("Appetizer: " + getName() + " - " + getDescription() +
                " | Spice Level: " + spiceLevel + " | $" + getPrice());
    }
}