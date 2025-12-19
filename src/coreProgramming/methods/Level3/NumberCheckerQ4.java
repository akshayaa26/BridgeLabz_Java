package coreProgramming.methods.Level3;

import java.util.Arrays;
import java.util.Scanner;

// Utility class for digit-based operations
class NumberCheckerQ4 {

    // Count digits
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Store digits in array
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Reverse digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Compare two arrays
    public static boolean compareArrays(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    // Palindrome check using digits
    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    // Duck number check using digits array
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] digits = getDigits(number);
        int[] reversed = reverseArray(digits);

        System.out.println("Digits      : " + Arrays.toString(digits));
        System.out.println("Reversed    : " + Arrays.toString(reversed));
        System.out.println("Palindrome? : " + isPalindrome(number));
        System.out.println("Duck Number?: " + isDuckNumber(number));

        input.close();
    }
}
