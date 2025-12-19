package coreProgramming.controlFlow.Level3;

import java.util.Scanner;

// Program to check whether a number is a Harshad Number
class HarshadNumberChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number;
        int sumOfDigits = 0;

        // Calculate sum of digits
        while (number != 0) {
            sumOfDigits += number % 10;
            number = number / 10;
        }

        // Check Harshad condition
        if (sumOfDigits != 0 && originalNumber % sumOfDigits == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number");
        }

        input.close();
    }
}
