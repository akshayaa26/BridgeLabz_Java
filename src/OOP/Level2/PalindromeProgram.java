package OOP.Level2;

import java.util.Scanner;

class PalindromeChecker {


    String text;
    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println("The given text is a Palindrome.");
        } else {
            System.out.println("The given text is NOT a Palindrome.");
        }
    }
}

public class PalindromeProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker(input);

        checker.displayResult();

        sc.close();
    }
}
