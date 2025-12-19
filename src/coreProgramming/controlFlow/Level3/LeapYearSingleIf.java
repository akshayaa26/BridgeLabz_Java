package coreProgramming.controlFlow.Level3;

import java.util.Scanner;

// Program to check Leap Year using single if condition
class LeapYearSingleIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take year input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Single if condition using logical operators
        if (year >= 1582 && 
           (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {

            System.out.println(year + " is a Leap Year");

        } else {
            System.out.println(year + " is not a Leap Year");
        }

        input.close();
    }
}
