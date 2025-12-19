package coreProgramming.methods.Level1;

// Create SumOfDigits class to compute the sum of digits using methods
class SumOfDigits {

    // Method to generate a 4-digit random number
    public int get4DigitRandomNumber() {
        return (int) (Math.random() * 9000) + 1000;
    }

    // Method to count digits in a number
    public int countDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Method to store digits of the number in an array
    public int[] getDigits(int number, int count) {
        int[] digits = new int[count];
        int temp = number;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Method to find sum of elements in an array
    public int sumArray(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        // Create object of class
        SumOfDigits sumOfDigits = new SumOfDigits();

        // Generate random number
        int number = sumOfDigits.get4DigitRandomNumber();
        System.out.println("The Random Number is: " + number);

        // Count digits
        int count = sumOfDigits.countDigits(number);
        System.out.println("The count of digits is: " + count);

        // Get digits in array
        int[] digits = sumOfDigits.getDigits(number, count);

        // Find sum of digits
        int sum = sumOfDigits.sumArray(digits);

        // Display result
        System.out.println("Sum of Digits: " + sum);
    }
}
