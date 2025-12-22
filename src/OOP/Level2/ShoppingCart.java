package OOP.Level2;
import java.util.Scanner;

class CartItem {

    // Attributes
    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0; // initially cart is empty
    }

    // Method to add item to cart
    void addItem(int qty) {
        if (qty > 0) {
            quantity += qty;
            System.out.println(qty + " item(s) added to cart.");
        } else {
            System.out.println("Invalid quantity.");
        }
    }

    // Method to remove item from cart
    void removeItem(int qty) {
        if (qty > 0 && qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " item(s) removed from cart.");
        } else {
            System.out.println("Invalid remove quantity.");
        }
    }

    // Method to display total cost
    void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("\n🛒 Cart Summary");
        System.out.println("Item Name  : " + itemName);
        System.out.println("Price      : ₹" + price);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Total Cost : ₹" + totalCost);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input item details
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        // Create CartItem object
        CartItem cart = new CartItem(name, price);

        // Add items
        System.out.print("\nEnter quantity to add: ");
        int addQty = sc.nextInt();
        cart.addItem(addQty);

        // Remove items
        System.out.print("\nEnter quantity to remove: ");
        int removeQty = sc.nextInt();
        cart.removeItem(removeQty);

        // Display total cost
        cart.displayTotalCost();

        sc.close();
    }
}
