package com.mathbank.core;

class Bank {
    private String name;
    private String agency;

    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = "Math Bank";
    }

    public String getAgency() {
        return this.agency;
    }

    protected void setAgency(String agency) {
        this.agency = "0001";
    }
}
