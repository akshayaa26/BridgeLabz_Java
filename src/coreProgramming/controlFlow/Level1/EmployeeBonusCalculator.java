package coreProgramming.controlFlow.Level1;

import java.util.Scanner;

// Program to calculate employee bonus based on years of service
class EmployeeBonusCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter employee salary (INR): ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        double bonus = 0.0;

        // Check bonus eligibility
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% bonus
            System.out.println("The employee is eligible for a bonus.");
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }

        // Display bonus amount
        System.out.println("Bonus amount is INR " + bonus);

        input.close();
    }
}
