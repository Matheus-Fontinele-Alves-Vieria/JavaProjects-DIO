package com.mathbank.entrypoint;

import com.mathbank.entities.PhysicalPerson;
import com.mathbank.entities.LegalPerson;
import com.mathbank.entities.CurrentAccount;
import com.mathbank.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        
        PhysicalPerson client1 = new PhysicalPerson(
            "Jão da Silva", 
            "123.456.789-00", 
            "1999-11-08", 
            "11-99999-9999", 
            "Rua Principal, 123, Centro, S\u00E3o Paulo"
        );
        
        CurrentAccount currentAccount1 = new CurrentAccount(200.50, "CC", 0);

        currentAccount1.setClient(client1);

        currentAccount1.addTransaction(16, "Deposit", currentAccount1);

        System.out.println("Cliente:");
        System.out.println("Nome: " + client1.getName());
        System.out.println();
        System.out.println("Conta:");
        System.out.println("Número: " + currentAccount1.getId());
        System.out.println("Tipo: " + currentAccount1.getAccountType());
        currentAccount1.printStatement();
    }
}
