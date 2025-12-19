package coreProgramming.controlFlow.Level1;

import java.util.Scanner;

// Program to perform rocket launch countdown using while loop
class RocketLaunchCountdown {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input for countdown start value
        System.out.print("Enter countdown start value: ");
        int counter = input.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // decrement counter
        }

        // Launch message
        System.out.println("🚀 Launch!");

        input.close();
    }
}
