package coreProgramming.methods.Level2;

import java.util.Scanner;

// Utility class for unit conversions
class UnitConvertor {

    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Sample usage
        System.out.print("Enter kilometers: ");
        double km = input.nextDouble();
        System.out.println("Miles = " + convertKmToMiles(km));

        System.out.print("\nEnter miles: ");
        double miles = input.nextDouble();
        System.out.println("Kilometers = " + convertMilesToKm(miles));

        System.out.print("\nEnter meters: ");
        double meters = input.nextDouble();
        System.out.println("Feet = " + convertMetersToFeet(meters));

        System.out.print("\nEnter feet: ");
        double feet = input.nextDouble();
        System.out.println("Meters = " + convertFeetToMeters(feet));

        input.close();
    }
}
