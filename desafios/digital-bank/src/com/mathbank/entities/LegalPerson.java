package com.mathbank.entities;

import com.mathbank.core.Client;

public class LegalPerson extends Client{
    private String cnpj;
    private String corporateName;
    private String businessType;

    public LegalPerson(String name, 
                       String cpf, 
                       String dateOfBirth, 
                       String phone, 
                       String address,
                       String cnpj,
                       String corporateName,
                       String businessType
                      ) {
        super(name, cpf, dateOfBirth, phone, address);
        this.cnpj = cnpj;
        this.corporateName = corporateName;
        this.businessType = businessType;
    }

    protected String getCnpj() {
        return cnpj;
    }

    protected void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    protected String getCorporateName() {
        return corporateName;
    }

    protected void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    protected String getBusinessType() {
        return businessType;
    }

    protected void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    @Override
    public String getTypeClient() {
        return "P. Jurídica";
    }
}
