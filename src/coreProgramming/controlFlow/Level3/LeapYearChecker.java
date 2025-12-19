package coreProgramming.controlFlow.Level3;

import java.util.Scanner;

// Program to check whether a given year is a Leap Year
class LeapYearChecker {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Validate Gregorian calendar year
        if (year >= 1582) {

            // Check leap year conditions
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }

        } else {
            System.out.println("Leap Year calculation is valid only for years >= 1582");
        }

        // Close scanner
        input.close();
    }
}
