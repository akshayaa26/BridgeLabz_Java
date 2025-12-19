package coreProgramming.controlFlow.Level2;

import java.util.Scanner;

// Program to calculate employee bonus based on years of service
class EmployeeBonusLevel2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take salary input
        System.out.print("Enter employee salary (INR): ");
        double salary = input.nextDouble();

        // Take years of service input
        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        double bonus = 0.0;

        // Apply bonus rule
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
            System.out.println("Employee is eligible for bonus.");
        } else {
            System.out.println("Employee is not eligible for bonus.");
        }

        // Print bonus amount
        System.out.println("Bonus amount is INR " + bonus);

        input.close();
    }
}
