package OOP.Level2;

import java.util.Scanner;

class BankAccount {

    // Attributes
    String accountHolder;
    long accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    // Method to display current balance
    void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class ATMSimulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input account details
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        long accNo = sc.nextLong();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        // Create BankAccount object
        BankAccount account = new BankAccount(name, accNo, balance);

        // Deposit
        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        // Withdraw
        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        // Display balance
        System.out.println();
        account.displayBalance();

        sc.close();
    }
}
