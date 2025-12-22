package OOP.Level1;

class MobilePhone {

    // Attributes (Data Members)
    String brand;
    String model;
    double price;

    // Constructor to initialize values
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    void displayDetails() {
        System.out.println("Brand  : " + brand);
        System.out.println("Model  : " + model);
        System.out.println("Price  : ₹" + price);
    }
}

public class MobilePhoneDetails {
    public static void main(String[] args) {

        // Creating MobilePhone object
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 74999);

        // Displaying phone details
        System.out.println("📱 Mobile Phone Details");
        phone1.displayDetails();
    }
}
