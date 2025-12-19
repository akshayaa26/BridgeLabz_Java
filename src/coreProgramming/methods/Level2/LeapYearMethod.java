package coreProgramming.methods.Level2;

import java.util.Scanner;

// Program to check whether a year is a Leap Year using a method
class LeapYearMethod {

    // Method to check Leap Year
    public static boolean isLeapYear(int year) {

        // Condition a: Gregorian calendar validation
        if (year < 1582) {
            return false;
        }

        // Condition b: Leap year rules
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take year input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Call method
        boolean result = isLeapYear(year);

        // Display output
        if (year < 1582) {
            System.out.println("Leap Year calculation is valid only for year >= 1582");
        } 
        else if (result) {
            System.out.println(year + " is a Leap Year");
        } 
        else {
            System.out.println(year + " is not a Leap Year");
        }

        input.close();
    }
}
