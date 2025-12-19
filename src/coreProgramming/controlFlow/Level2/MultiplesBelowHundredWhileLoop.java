package coreProgramming.controlFlow.Level2;

import java.util.Scanner;

// Program to find all multiples of a number below 100 using while loop
class MultiplesBelowHundredWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        // Validate input
        if (number > 0 && number < 100) {

            System.out.println("Multiples of " + number + " below 100 are:");

            int counter = 100;

            // While loop to find multiples
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }

        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }

        input.close();
    }
}
