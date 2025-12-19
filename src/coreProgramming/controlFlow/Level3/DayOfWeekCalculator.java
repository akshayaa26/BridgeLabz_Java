package coreProgramming.controlFlow.Level3;

import java.util.Scanner;

// Program to determine the day of the week for a given date
class DayOfWeekCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter month (1-12): ");
        int m = input.nextInt();

        System.out.print("Enter day: ");
        int d = input.nextInt();

        System.out.print("Enter year: ");
        int y = input.nextInt();

        // Apply Gregorian calendar formula
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Output numeric day
        System.out.println("Day of the week (0=Sunday, 1=Monday, ... 6=Saturday): " + d0);

        // Optional readable output
        String[] days = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
        };

        System.out.println("That day is: " + days[d0]);

        input.close();
    }
}
