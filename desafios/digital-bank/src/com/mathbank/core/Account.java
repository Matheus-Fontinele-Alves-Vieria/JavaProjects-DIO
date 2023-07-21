package com.mathbank.core;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.mathbank.core.encapsulation.IAccount;

public abstract class Account implements IAccount {
    private static final Logger LOGGER = Logger.getLogger(Account.class.getName());

    private long idAccount;
    private double balance;
    private String accountType;
    private List<Transaction> transactions;

    private static long ACCOUNT_ID_START = 00001;

    public Account(double balance, String accountType) {
        this.idAccount = generateAccountId();
        this.balance = balance;
        this.accountType = accountType;
        this.transactions = new ArrayList<>();
    }

    public abstract void setClient(Client client);

    protected long generateAccountId() {
        return ACCOUNT_ID_START++;
    }

    public long getId() {
        return this.idAccount;
    }
    
    protected void deposit(double amount) {
        this.balance += amount;        
    }

    public String getAccountType() {
        return this.accountType;
    }

    protected double getBalance() {
        return this.balance;
    }

    protected List<Transaction> getTransactions() {
        return this.transactions;
    }

    @Override
    public void addTransaction(double amount, String description, IAccount toAccount) {
        if (description.equals("Deposit")) {
            deposit(amount);
        } 
        else if (description.equals("Transfer")) {
            transfer(amount, toAccount);
        }

        Transaction transaction = new Transaction(amount, description, this, (Account) toAccount);
        this.transactions.add(transaction);
    }

    protected void payBill(long billId) {
        withdraw(billId);
    }

    protected void printStatementInfo() {
        System.out.println("Account ID: " + idAccount);
        System.out.println("Account type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("Transactions:");
        for(Transaction transaction : transactions) {
            LOGGER.info("   ID: " + transaction.getId());
            LOGGER.info("   Amount: " + transaction.getAmount());
            LOGGER.info("   Description: " + transaction.getDescription());
            LOGGER.info("   Get Account: " + transaction.getAccount());
            LOGGER.info("   To Account: " + transaction.getToAccount());
        }
    }

    protected void transfer(double amount, IAccount toAccount) {
        this.withdraw(amount);
        ((Account) toAccount).deposit(amount);
    }

    protected void withdraw(double amount) {
        if(this.balance < amount) {
            LOGGER.warning("Saldo insuficiente");
            return;
        }

        this.balance -= amount;
    }
}
