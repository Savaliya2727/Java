// Main class to test the BankAccount and SavingsAccount classes
public class Ass15 {
    public static void main(String[] args) {
        // Creating an object of BankAccount class
        BankAccount account1 = new BankAccount(500);
        account1.deposit(200);
        account1.withdraw(100);
        account1.displayBalance();

        // Creating an object of SavingsAccount class
        SavingsAccount account2 = new SavingsAccount(500);
        account2.deposit(200);
        account2.withdraw(600); // This should be denied
        account2.withdraw(200); // This should be allowed
        account2.displayBalance();
    }
}
// Base class
class BankAccount {
    // Instance variable for account balance
    double balance;

    // Constructor to initialize balance
    BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to deposit an amount into the account
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw an amount from the account
    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal");
        }
    }

    // Method to display the current balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Subclass that overrides the withdraw() method
class SavingsAccount extends BankAccount {

    // Constructor to initialize balance
    SavingsAccount(double balance) {
        super(balance);
    }

    // Overriding the withdraw() method to prevent withdrawals if balance falls below 100
    @Override
    void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal denied. Insufficient balance or balance would fall below 100");
        }
    }
}

