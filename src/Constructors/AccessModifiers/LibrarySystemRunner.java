package Constructors.AccessModifiers;
public class LibrarySystemRunner {

    public static void main(String[] args) {


        LibraryItem item1 = new LibraryItem(
                "978-0132350884",
                "Clean Code",
                "Robert C. Martin"
        );

        System.out.println("📘 Library Item Details");
        System.out.println("ISBN   : " + item1.ISBN);
        System.out.println("Author : " + item1.getAuthor());

        item1.setAuthor("Uncle Bob");
        System.out.println("Updated Author : " + item1.getAuthor());

        System.out.println("\n------------------------------\n");

        DigitalBook db = new DigitalBook(
                "978-1491950357",
                "Effective Java",
                "Joshua Bloch",
                "PDF"
        );

        System.out.println("📱 Digital Book Details");
        db.displayDigitalBookDetails();
    }
}
class LibraryItem {

    public String ISBN;
    protected String title;
    private String author;


    LibraryItem(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class DigitalBook extends LibraryItem {

    String format;

    DigitalBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    void displayDigitalBookDetails() {
        System.out.println("ISBN   : " + ISBN);        // public
        System.out.println("Title  : " + title);       // protected
        System.out.println("Author : " + getAuthor()); // private via getter
        System.out.println("Format : " + format);
    }
}
