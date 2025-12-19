package coreProgramming.methods.Level1;

import java.util.Scanner;

// Program to check whether a number is an Armstrong number using a method
class ArmstrongNumberMethod {

    // Method to check Armstrong number
    public boolean isArmstrong(int number) {

        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit; // cube of digit
            number /= 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Create object
        ArmstrongNumberMethod checker = new ArmstrongNumberMethod();

        // Call method
        boolean result = checker.isArmstrong(number);

        // Display result
        if (result) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }

        input.close();
    }
}
