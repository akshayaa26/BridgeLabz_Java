package Constructors.Level1;
public class CarRentalDemo {

    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        System.out.println("🚗 Default Rental Details");
        rental1.displayRentalDetails();

        System.out.println();
        CarRental rental2 = new CarRental("Akshayaa", "Hyundai Creta", 4);
        System.out.println("🚗 Parameterized Rental Details");
        rental2.displayRentalDetails();
    }
}
class CarRental {

    String customerName;
    String carModel;
    int rentalDays;

    final double COST_PER_DAY = 1500.0;

    CarRental() {
        customerName = "Guest";
        carModel = "Basic Model";
        rentalDays = 1;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * COST_PER_DAY;
    }

    void displayRentalDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : ₹" + calculateTotalCost());
    }
}
