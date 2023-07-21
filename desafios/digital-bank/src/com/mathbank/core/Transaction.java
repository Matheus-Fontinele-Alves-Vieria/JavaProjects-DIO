package com.mathbank.core;

class Transaction {
    private long id;
    private double amount;
    private String description;
    private Account account;
    private Account toAccount;

    private static long TRANSACTION_ID_START = 1;

    public Transaction(double amount, String description, Account account, Account toAccount) {
        this.id = generateTransactionId();
        this.amount = amount;
        this.description = description;
        this.account = account;
        this.toAccount = toAccount;
    }

    protected long generateTransactionId() {
        return TRANSACTION_ID_START++;
    }

    protected long getId() {
        return this.id;
    }

    protected double getAmount() {
        return this.amount;
    }

    protected String getDescription() {
        return this.description;
    }

    protected Account getAccount() {
        return this.account;
    }

    protected Account getToAccount() {
        return this.toAccount;
    }
}
