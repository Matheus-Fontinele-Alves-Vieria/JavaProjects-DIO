package com.mathbank.entrypoint;

import com.mathbank.entities.PhysicalPerson;
import com.mathbank.entities.LegalPerson;
import com.mathbank.entities.CurrentAccount;
import com.mathbank.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {  
        PhysicalPerson physicalPerson1 = new PhysicalPerson(
            "Jão da Silva", 
            "123.456.789-00", 
            "1999-11-08", 
            "11-99999-9999", 
            "Rua Principal, 123, Centro, São Paulo"
        );

        PhysicalPerson physicalPerson2 = new PhysicalPerson(
            "Alexa Lima", 
            "987-654-321-00", 
            "1997-08-12", 
            "11-98600-9999", 
            "Rua X, 859, ZN, São Paulo"
        );

        PhysicalPerson physicalPerson3 = new PhysicalPerson(
            "Iara Melo", 
            "012-567-901-72", 
            "2001-07-02", 
            "11-99912-3456", 
            "Rua do Batman, 1024, ZO, São Paulo"
        );

        LegalPerson legalPerson1 = new LegalPerson(
            "Joaquim Oliveira", 
            "901-345-187-76", 
            "1987-08-16", 
            "11-98259-0019", 
            "Avenida Paulista, 3890, Centro, São Paulo", 
            "94.159.015/0001-40", 
            "WorkTech", 
            "Licitação"
        );

        LegalPerson legalPerson2 = new LegalPerson(
            "Matheus Vieira", 
            "012-698-284-87", 
            "1999-09-08", 
            "85-99151-8864", 
            "Avenida Santos Dumont, 2500, Fortaleza", 
            "09.449.009/0001-59", 
            "MathVieira Inc.", 
            "Software"
        );
        
        // ----------------------------------------------------------------- //

        CurrentAccount currentAccount1 = new CurrentAccount(
            200.50, 
            "CC", 
            0
        );

        SavingsAccount savingsAccount1 = new SavingsAccount(
            98.90, 
            "CP"
        );

        SavingsAccount savingsAccount2 = new SavingsAccount(
            1.96, 
            "CP"
        );

        CurrentAccount currentAccount2 = new CurrentAccount(
            14200.88, 
            "CC", 
            20000
        );

        CurrentAccount currentAccount3 = new CurrentAccount(
            1800563.97, 
            "CC", 
            50000
        );

        // ----------------------------------------------------------------- //

        currentAccount1.setClient(physicalPerson1);
        currentAccount1.addTransaction(6, "Deposit", currentAccount1);

        // ----------------------------------------------------------------- //

        System.out.println("Cliente:");
        System.out.println("Nome: " + physicalPerson1.getName());
        System.out.println();
        System.out.println("Conta:");
        System.out.println("Número: " + currentAccount1.getId());
        System.out.println("Tipo: " + currentAccount1.getAccountType());
        currentAccount1.printStatement();
    }
}
