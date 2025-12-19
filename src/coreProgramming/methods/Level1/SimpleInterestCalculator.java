package coreProgramming.methods.Level1;

import java.util.Scanner;

// Program to calculate Simple Interest using a method
class SimpleInterestCalculator {

    // Method to calculate simple interest
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();

        // Create object of class
        SimpleInterestCalculator calculator = new SimpleInterestCalculator();

        // Call method
        double simpleInterest = calculator.calculateSimpleInterest(principal, rate, time);

        // Display result
        System.out.println("\nSimple Interest = " + simpleInterest);

        input.close();
    }
}
