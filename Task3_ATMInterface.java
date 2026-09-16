public class BankAccount {

    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Check balance
    public double checkBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");

        } else if (amount > balance) {
            System.out.println("Insufficient balance.");

        } else {
            balance = balance - amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }
}
