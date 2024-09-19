import java.util.*;
class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("\nYour bank account is credited with Rs."+ amount + "\nCurrent Balance: "+ balance);
        } else {
            System.out.println("Enter a valid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("\nYour bank account is debited by Rs."+ amount+ "\nCurrent Balance: "+ balance);
        } else {
            System.out.println("Insufficient balance. Please enter a valid amount.");
        }
    }

    public void AccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: Rs." + balance);
    }
}

public class Banking {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        BankAccount acc1 = new BankAccount("101", "Ahana", 10000.0);
        acc1.AccountInfo();

        System.out.print("\nEnter amount to be deposited: ");
        double depositAmt = scan.nextDouble();
        acc1.deposit(depositAmt);

        System.out.print("\nEnter amount to be withdrawn: ");
        double withdrawAmt = scan.nextDouble();
        acc1.withdraw(withdrawAmt);

        System.out.println("\nFinal details: ");

        acc1.AccountInfo();
    }
}

