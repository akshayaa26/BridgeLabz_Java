package Constructors.Level1;
public class LibraryBookDemo {

    public static void main(String[] args) {

        // Create Book1 object
        Book1 book = new Book1("Clean Code", "Robert C. Martin", 499);

        System.out.println("📚 Book Details Before Borrowing");
        book.displayBookDetails();

        System.out.println("\nAttempting to borrow the book...");
        book.borrowBook();

        System.out.println("\n📚 Book Details After Borrowing");
        book.displayBookDetails();
    }
}
class Book1 {

    // Attributes
    String title;
    String author;
    double price;
    boolean available;

    // Constructor
    Book1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true; // initially available
    }

    // Method to borrow the book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("📖 Book borrowed successfully.");
        } else {
            System.out.println("❌ Book is currently not available.");
        }
    }

    // Method to display book details
    void displayBookDetails() {
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : ₹" + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
    }
}
