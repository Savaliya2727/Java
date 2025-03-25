// Main class to test the Account interface and its implementations
public class Ass18 {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savings = new SavingsAccount(1000, 5); // Initial balance: 1000, Interest rate: 5%
        savings.deposit(500);
        savings.withdraw(200);
        savings.calculateInterest();
        savings.viewBalance();

        // Create a CurrentAccount object
        CurrentAccount current = new CurrentAccount(2000); // Initial balance: 2000
        current.deposit(1000);
        current.withdraw(500);
        current.calculateInterest();
        current.viewBalance();
    }
}

// Define the Account interface
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    void viewBalance();
}

// Implement the Account interface in the SavingsAccount class
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    // Constructor to initialize balance and interest rate
    SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    @Override
    public void viewBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }
}

// Implement the Account interface in the CurrentAccount class
class CurrentAccount implements Account {
    private double balance;

    // Constructor to initialize balance
    CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal");
        }
    }

    @Override
    public void calculateInterest() {
        // No interest for CurrentAccount in this example
        System.out.println("No interest for current account");
    }

    @Override
    public void viewBalance() {
        System.out.println("Current Account Balance: " + balance);
    }
}

