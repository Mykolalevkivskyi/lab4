package Part2;

// Part 2
// Task 2 The Bank Account
public class BankAccount {

    private double balance;
    private final String accountNumber;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount < 0) {
            return;
        }

        balance = balance + amount;
        System.out.println("Deposit: " + amount);
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount < 0) {
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }

        balance = balance - amount;
        System.out.println("Withdraw: " + amount);
    }

    // Get current balance
    public double getBalance() {
        return balance;
    }

    // Get account number
    public String getAccountNumber() {
        return accountNumber;
    }

/*
    public void changeAccountNumber() {
        accountNumber = "ACC002";

    }

 */

}
