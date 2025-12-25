package Constructors.InstanceClassVariablesMethods;
public class ProductInventoryDemo {

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 65000);
        Product p2 = new Product("Mobile", 30000);
        Product p3 = new Product("Headphones", 2000);
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        System.out.println();
        Product.displayTotalProducts();
    }
}
class Product {
    String productName;
    double price;
    static int totalProducts = 0;
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
        System.out.println("---------------------------");
    }
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}
