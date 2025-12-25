package Constructors.InstanceClassVariablesMethods;
public class VehicleRegistrationDemo {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Akshayaa", "Car");
        Vehicle v2 = new Vehicle("Rahul", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        System.out.println();


        Vehicle.updateRegistrationFee(8500);

        System.out.println("\nAfter Updating Registration Fee:\n");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

class Vehicle {

    String ownerName;
    String vehicleType;

    static double registrationFee = 6000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner Name        : " + ownerName);
        System.out.println("Vehicle Type      : " + vehicleType);
        System.out.println("Registration Fee  : ₹" + registrationFee);
        System.out.println("---------------------------------");
    }
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
