package task2;

public class MainCourse extends MenuItem {
    private int cookingTime;

    public MainCourse(int id, String name, String description, double price, int cookingTime) {
        super(id, name, description, price);
        this.cookingTime = cookingTime;
    }

    @Override
    public void displayItemInfo() {
        System.out.println("Main Course: " + getName() + " - " + getDescription() +
                " | Cooking Time: " + cookingTime + " mins | $" + getPrice());
    }
}