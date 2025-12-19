package coreProgramming.methods.Level3;

import java.util.Scanner;

// Utility class for factor-based operations
class NumberCheckerQ6 {

    // Get factors
    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    public static boolean isPerfect(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number) sum += f;
        }
        return sum == number;
    }

    public static boolean isAbundant(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number) sum += f;
        }
        return sum > number;
    }

    public static boolean isDeficient(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number) sum += f;
        }
        return sum < number;
    }

    public static boolean isStrong(int number) {
        int temp = number, sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] factors = getFactors(number);

        System.out.println("Greatest Factor           : " + greatestFactor(factors));
        System.out.println("Sum of Factors            : " + sumOfFactors(factors));
        System.out.println("Product of Factors        : " + productOfFactors(factors));
        System.out.println("Product of Cubes          : " + productOfCubeOfFactors(factors));
        System.out.println("Perfect Number            : " + isPerfect(number, factors));
        System.out.println("Abundant Number           : " + isAbundant(number, factors));
        System.out.println("Deficient Number          : " + isDeficient(number, factors));
        System.out.println("Strong Number             : " + isStrong(number));

        input.close();
    }
}

