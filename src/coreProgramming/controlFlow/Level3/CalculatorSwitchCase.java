package coreProgramming.controlFlow.Level3;

import java.util.Scanner;

// Program to create a calculator using switch-case
class CalculatorSwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take first number
        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        // Take second number
        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        // Take operator
        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();

        double result;

        // Perform operation using switch-case
        switch (op) {

            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}
