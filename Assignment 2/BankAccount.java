package assignment2;
public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0; // Initial balance is set to 0
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check the balance
    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("101", "Alisha");

        // Display initial account info
        account.displayAccountInfo();

        // Deposit money
        account.deposit(500.00);
        account.displayAccountInfo();

        // Withdraw money
        account.withdraw(200.00);
        account.displayAccountInfo();

        // Attempt to withdraw more than balance
        account.withdraw(400.00); // Insufficient balance
        account.displayAccountInfo();

        // Attempt to deposit a negative amount
        account.deposit(-100.00); // Invalid deposit
        account.displayAccountInfo();
    }
}
