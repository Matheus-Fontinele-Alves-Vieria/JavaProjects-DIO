public class App {
    public static void main(String[] args) throws Exception {
        for(BrazilianCities uf: BrazilianCities.values()) {
            System.out.println(uf.getNameUpperCase() + "-" + uf.getAcronym());
        }

        BrazilianCities selectedCities = BrazilianCities.FORTALEZA;

        System.out.println("O estado selecionado foi: " + selectedCities.getAcronym());
    }
}
