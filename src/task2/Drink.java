package task2;

public class Drink implements Orderable {
    private int id;
    private String name;
    private String size;
    private double price;

    public Drink(int id, String name, String size, double price) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.price = price;
    }

    @Override
    public void displayItemInfo() {
        System.out.println("Drink: " + name + " - Size: " + size + " | $" + price);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getId() {
        return id;
    }
}