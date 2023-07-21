package com.mathbank.entities;

import com.mathbank.core.Client;

public class PhysicalPerson extends Client {
    public PhysicalPerson(String name, String cpf, String dateOfBirth, String phone, String address) {
        super(name, cpf, dateOfBirth, phone, address);
    }

    @Override
    public String getTypeClient() {
        return "P. Física";
    }
}
