package coreProgramming.string.Level1;

import java.util.Scanner;

public class StringIndex {

    static void generate(String s) {
        System.out.println(s.charAt(10));
    }

    static void handle(String s) {
        try {
            System.out.println(s.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // generate(s);
        handle(s);
    }
}

