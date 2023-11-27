package Yee;

public class account {
    private double balance;

    public account(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: " + amount + ", New Balance: " + balance);
    }

    public synchronized double getBalance() {
        return balance;
    }
}
