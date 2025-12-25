package Constructors.AccessModifiers;

public class BankSystemRunner {

    public static void main(String[] args) {


        AccountBase acc1 = new AccountBase(123456, "Akshayaa", 50000);

        System.out.println("🏦 Account Details");
        acc1.displayAccountDetails();


        acc1.deposit(10000);
        acc1.withdraw(5000);

        System.out.println("\nAfter Transactions:");
        System.out.println("Current Balance: ₹" + acc1.getBalance());

        System.out.println("\n-----------------------------\n");


        SavingsCustomerAccount savings =
                new SavingsCustomerAccount(789012, "Rahul", 75000, 4.5);

        System.out.println("💰 Savings Account Details");
        savings.displaySavingsDetails();
    }
}
class AccountBase {

    public int accountNumber;
    protected String accountHolder;
    private double balance;


    AccountBase(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }


    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : ₹" + balance);
    }
}

class SavingsCustomerAccount extends AccountBase {

    double interestRate;

    // Constructor
    SavingsCustomerAccount(int accountNumber,
                           String accountHolder,
                           double balance,
                           double interestRate) {

        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }


    void displaySavingsDetails() {
        System.out.println("Account Number : " + accountNumber);   // public
        System.out.println("Account Holder : " + accountHolder);   // protected
        System.out.println("Balance        : ₹" + getBalance());   // private via getter
        System.out.println("Interest Rate  : " + interestRate + "%");
    }
}
