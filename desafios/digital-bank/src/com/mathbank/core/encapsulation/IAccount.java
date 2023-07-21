package com.mathbank.core.encapsulation;

public interface IAccount {
    abstract void addTransaction(double amount, String description, IAccount toAccount);
    abstract void printStatement();
}
