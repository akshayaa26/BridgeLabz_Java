package coreProgramming.controlFlow.Level3;

import java.util.Scanner;

// Program to count the number of digits in an integer
class DigitCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int count = 0;

        // Special case: if number is 0
        if (number == 0) {
            count = 1;
        } else {
            // Count digits using loop
            while (number != 0) {
                number = number / 10; // remove last digit
                count++;
            }
        }

        // Output result
        System.out.println("The number of digits is " + count);

        input.close();
    }
}
