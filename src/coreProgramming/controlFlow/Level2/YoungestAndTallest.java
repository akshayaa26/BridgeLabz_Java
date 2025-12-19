package coreProgramming.controlFlow.Level2;

import java.util.Scanner;

// Program to find the youngest and tallest among Amar, Akbar, and Anthony
class YoungestAndTallest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Inputs for Amar
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Amar's height (cm): ");
        double amarHeight = input.nextDouble();

        // Inputs for Akbar
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Akbar's height (cm): ");
        double akbarHeight = input.nextDouble();

        // Inputs for Anthony
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter Anthony's height (cm): ");
        double anthonyHeight = input.nextDouble();

        // Find youngest (minimum age)
        String youngest = "Amar";
        int minAge = amarAge;

        if (akbarAge < minAge) {
            minAge = akbarAge;
            youngest = "Akbar";
        }
        if (anthonyAge < minAge) {
            minAge = anthonyAge;
            youngest = "Anthony";
        }

        // Find tallest (maximum height)
        String tallest = "Amar";
        double maxHeight = amarHeight;

        if (akbarHeight > maxHeight) {
            maxHeight = akbarHeight;
            tallest = "Akbar";
        }
        if (anthonyHeight > maxHeight) {
            maxHeight = anthonyHeight;
            tallest = "Anthony";
        }

        // Output
        System.out.println("The youngest among the three is " + youngest +
                           " with age " + minAge + " years.");
        System.out.println("The tallest among the three is " + tallest +
                           " with height " + maxHeight + " cm.");

        input.close();
    }
}
