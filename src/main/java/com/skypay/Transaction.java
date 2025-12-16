package com.skypay;

public class Transaction {

    private String date;
    private int amount;
    private int balance;

    public Transaction(String date, int amount, int balance) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public int getBalance() {
        return balance;
    }
}
