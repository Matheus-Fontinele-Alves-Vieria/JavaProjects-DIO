package com.mathbank.entities;

import com.mathbank.core.Account;
import com.mathbank.core.Client;

public class SavingsAccount extends Account {
    private Client client;
    private static double yield = 0.7186;

    public SavingsAccount(double balance, String accountType) {
        super(balance, accountType);
    }

    protected double getYield() {
        return yield;
    }

    protected double calculateYield() {
        return getBalance() * yield / 12;
    }

    protected double getTotal() {
        return getBalance() + calculateYield();
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

        System.out.println("===== EXTRATO BANCÁRIO (C. Poupança) =====");
        super.printStatementInfo();
        System.out.println("Rendimento da conta: " + getYield());
        System.out.println("Saldo com o rendimento: " + getTotal());

        System.out.println();
    }
}
