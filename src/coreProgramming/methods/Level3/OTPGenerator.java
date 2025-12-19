package coreProgramming.methods.Level3;

import java.util.Arrays;

// Program to generate OTPs and validate uniqueness
class OTPGenerator {

    // Method to generate 6-digit OTP
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check uniqueness of OTPs
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] otps = new int[10];

        // Generate OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        System.out.println(Arrays.toString(otps));

        // Check uniqueness
        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are UNIQUE");
        } else {
            System.out.println("Duplicate OTPs found");
        }
    }
}
