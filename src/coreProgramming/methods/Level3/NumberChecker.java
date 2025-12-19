package coreProgramming.methods.Level3;

import java.util.Scanner;

// Utility class for number checking operations
class NumberChecker {

    // Method to check Duck Number
    public static boolean isDuckNumber(int number) {

        // Remove leading zeros by checking digit-wise
        while (number > 0) {
            if (number % 10 == 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    // Method to check Armstrong Number (3-digit)
    public static boolean isArmstrong(int number) {

        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        return sum == original;
    }

    // Method to find largest digit
    public static int findLargestDigit(int number) {

        int largest = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit > largest) {
                largest = digit;
            }
            number /= 10;
        }
        return largest;
    }

    // Method to find smallest digit
    public static int findSmallestDigit(int number) {

        int smallest = 9;

        while (number > 0) {
            int digit = number % 10;
            if (digit < smallest) {
                smallest = digit;
            }
            number /= 10;
        }
        return smallest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Duck Number
        if (isDuckNumber(number)) {
            System.out.println(number + " is a Duck Number");
        } else {
            System.out.println(number + " is not a Duck Number");
        }

        // Armstrong Number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }

        // Largest & Smallest digit
        System.out.println("Largest Digit  : " + findLargestDigit(number));
        System.out.println("Smallest Digit : " + findSmallestDigit(number));

        input.close();
    }
}
