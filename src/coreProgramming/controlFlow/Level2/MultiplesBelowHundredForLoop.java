package coreProgramming.controlFlow.Level2;

import java.util.Scanner;

// Program to find all multiples of a number below 100 using for loop
class MultiplesBelowHundredForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        // Validate input
        if (number > 0 && number < 100) {

            System.out.println("Multiples of " + number + " below 100 are:");

            // Loop backwards from 100 to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }

        input.close();
    }
}
