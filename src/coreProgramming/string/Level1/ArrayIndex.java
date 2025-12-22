package coreProgramming.string.Level1;

import java.util.Scanner;

public class ArrayIndex {

    static void generate(String[] arr) {
        System.out.println(arr[5]);
    }

    static void handle(String[] arr) {
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];
        for (int i = 0; i < 3; i++) {
            names[i] = sc.next();
        }

        // generate(names);
        handle(names);
    }
}
