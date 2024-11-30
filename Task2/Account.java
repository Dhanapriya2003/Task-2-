package Task2;
import java.util.Scanner;

public class Account {

    private double balance; // Data member to store the account balance

    // No-argument constructor
    public Account() {
        balance = 0.0; // Initialize balance to 0
    }

    // Constructor with one argument to set the initial balance
    public Account(double initialBalance) {
        balance = initialBalance;
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Add the amount to the balance
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be greater than zero!");
        }
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Deduct the amount from the balance
            System.out.println("Successfully withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Withdrawal amount must be greater than zero!");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}


