package task2;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantApp {
    private static ArrayList<Orderable> menu = new ArrayList<>();
    private static Order currentOrder = new Order();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        initializeMenu();

        while (running) {
            System.out.println("\n==== Restaurant Menu ====");
            System.out.println("1. View Menu");
            System.out.println("2. Add Item to Order");
            System.out.println("3. Remove Item from Order");
            System.out.println("4. View Order");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> viewMenu();
                case 2 -> addItem(scanner);
                case 3 -> removeItem(scanner);
                case 4 -> currentOrder.displayOrderDetails();
                case 5 -> {
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private static void initializeMenu() {
        menu.add(new Appetizer(1, "Spring Rolls", "Crispy veggie rolls", 5.99, "Medium"));
        menu.add(new MainCourse(2, "Grilled Chicken", "Juicy grilled chicken breast", 12.49, 20));
        menu.add(new Dessert(3, "Chocolate Cake", "Rich chocolate with fudge", 6.75, false));
        menu.add(new Drink(4, "Coke", "Medium", 2.50));
        menu.add(new Drink(5, "Orange Juice", "Large", 3.25));
    }

    private static void viewMenu() {
        System.out.println("\n--- Menu Items ---");
        for (Orderable item : menu) {
            item.displayItemInfo();
        }
    }

    private static void addItem(Scanner scanner) {
        viewMenu();
        System.out.print("Enter the item ID to add to your order: ");
        int id = scanner.nextInt();
        Orderable item = findItemById(id);
        if (item != null) {
            currentOrder.addItem(item);
            System.out.println("Item added.");
        } else {
            System.out.println("Item ID not found.");
        }
    }

    private static void removeItem(Scanner scanner) {
        currentOrder.displayOrderDetails();
        System.out.print("Enter the item ID to remove: ");
        int id = scanner.nextInt();
        currentOrder.removeItem(id);
        System.out.println("Item removed (if it existed).");
    }

    private static Orderable findItemById(int id) {
        for (Orderable item : menu) {
            if (item.getId() == id) return item;
        }
        return null;
    }
}