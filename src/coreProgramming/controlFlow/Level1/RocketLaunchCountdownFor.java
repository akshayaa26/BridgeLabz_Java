package coreProgramming.controlFlow.Level1;

import java.util.Scanner;

// Program to perform rocket launch countdown using for loop
class RocketLaunchCountdownFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input for countdown start value
        System.out.print("Enter countdown start value: ");
        int counter = input.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Launch message
        System.out.println("🚀 Launch!");

        input.close();
    }
}
