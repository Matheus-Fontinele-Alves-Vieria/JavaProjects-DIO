public enum BrazilianCities {
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
    FORTALEZA("Fortaleza", "CE");
    
    private String name;
    private String acronym; 

    private BrazilianCities(String name, String acronym) {
        this.name = name;
        this.acronym = acronym;
    }

    public String getName() {
        return name;
    }

    public String getAcronym() {
        return acronym;
    }

    public String getNameUpperCase() {
        return name.toUpperCase();
    }
}
