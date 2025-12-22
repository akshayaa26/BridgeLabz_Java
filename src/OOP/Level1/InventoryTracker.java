package OOP.Level1;
import java.util.Scanner;

class Item {

    // Attributes
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayItemDetails() {
        System.out.println("Item Code  : " + itemCode);
        System.out.println("Item Name  : " + itemName);
        System.out.println("Item Price : ₹" + price);
    }

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input item details
        System.out.print("Enter Item Code: ");
        int code = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        // Create Item object
        Item item = new Item(code, name, price);

        // Display item details
        System.out.println("\n--- Item Details ---");
        item.displayItemDetails();

        // Input quantity
        System.out.print("\nEnter Quantity: ");
        int quantity = sc.nextInt();

        // Calculate and display total cost
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost : ₹" + totalCost);

        sc.close();
    }
}
