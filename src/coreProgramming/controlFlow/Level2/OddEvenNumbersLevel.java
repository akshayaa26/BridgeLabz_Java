package coreProgramming.controlFlow.Level2;

import java.util.Scanner;

// Program to print odd and even numbers from 1 to N
class OddEvenNumbersLevel2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Validate natural number
        if (number > 0) {

            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }

        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }

        input.close();
    }
}
