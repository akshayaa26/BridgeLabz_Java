package coreProgramming.string.Level1;

import java.util.Scanner;

public class NumberFormat {

    static void generate(String text) {
        int n = Integer.parseInt(text);
        System.out.println(n);
    }

    static void handle(String text) {
        try {
            int n = Integer.parseInt(text);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // generate(text);
        handle(text);
    }
}

