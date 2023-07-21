package com.mathbank.entities;

import com.mathbank.core.Account;
import com.mathbank.core.Client;

public class CurrentAccount extends Account {
    private Client client;
    private double creditLimit;

    public CurrentAccount(double balance, String accountType, double creditLimit) {
        super(balance, accountType);
        this.creditLimit = creditLimit;
    }

    public void credit(double amount) {
        if(this.creditLimit < amount) {
            System.out.println("Saldo insuficiente");
        }

        creditLimit -= amount;

        System.out.println("You use credit: " + amount);
    }

    @Override
    public void setClient(Client client) {
        this.client = client;
    }

    protected Client getClient() {
        return this.client;
    }

    @Override
    public void printStatement() {
        System.out.println();

        System.out.println("===== EXTRATO BANCÁRIO (C. Corrente) =====");
        super.printStatementInfo();
        System.out.println("Credit limit: " + creditLimit);

        System.out.println();
    }
}
