package com.teachmeskills.lesson6.task1;
public class CreditCard {
    public int accountNumber;
    public double amount;
    public CreditCard(int accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
    void increaseAmount(double sum) {
        if (sum > 0) {
            amount = amount + sum;
            System.out.println("The current amount in the account is " + amount);
        }
        else {
            System.out.println("Unavailable operation!");
        }
    }
    void reduceAmount(double sum) {
        if (sum < amount) {
            amount = amount - sum;
            System.out.println("The current amount in the account is " + amount);
        }
        else {
            System.out.println("Unavailable operation!");
        }
    }
    void info () {
        System.out.println("Account number of card: " + accountNumber +
                "\nThe current amount in the account is " + amount);
    }
}
