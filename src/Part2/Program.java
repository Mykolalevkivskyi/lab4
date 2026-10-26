package Part2;

// Part 2
// Task 2 The Bank Account
public class Program {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("ACC001");

        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Initial balance: " + account.getBalance());

        account.deposit(500);
        account.withdraw(200);
        account.withdraw(700);
        account.deposit(-100);

        // account.accountNumber = "ACC002"; // Error
        // The account number is private and final.
        // A final field cannot be reassigned after initialization.

        System.out.println("Final balance: " + account.getBalance());
    }
}
