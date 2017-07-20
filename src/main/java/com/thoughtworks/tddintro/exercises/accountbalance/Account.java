package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {

    private double balance;

    public Account(double startingAmount) {
        balance = startingAmount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

}
