package Constructors.Level1;
import java.util.*;
class Book {

    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
    }
}

public class BookDemo {
    public static void main(String[] args) {

        Book book1 = new Book();

        Book book2 = new Book("Clean Code", "Robert C. Martin", 499);

        System.out.println("📘 Book 1 Details");
        book1.displayDetails();

        System.out.println("\n📘 Book 2 Details");
        book2.displayDetails();
    }
}
