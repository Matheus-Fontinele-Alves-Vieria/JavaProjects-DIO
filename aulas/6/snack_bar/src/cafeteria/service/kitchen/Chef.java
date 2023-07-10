package cafeteria.service.kitchen;

import cafeteria.service.Attendant;

public class Chef {
    public void addSnackOnTheCounter() {
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
    }

    public void addCoffeeAtTheCounter() {
        System.out.println("ADICIONANDO CAFÉ NO BALCÃO");
    }

    public void addComboAtTheCounter() {
        addSnackOnTheCounter();
        addCoffeeAtTheCounter();
    }

    void prepareSnack() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
    }

    void prepareCoffee() {
        System.out.println("PREPARANDO CAFÉ");
    }

    void prepareCombo() {
        prepareSnack();
        prepareCoffee();
    }

    void selectSnackIngredients() {
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
    }

    void selectCoffeeIngredients() {
        System.out.println("SELECIONANDO O GRÃO DE CAFÉ");
    }

    void washIngredients() {
        System.out.println("LAVANDO INGREDIENTES");
    }

    void strainCoffee() {
        System.out.println("COANDO CAFÉ");
    }

    void askToChangeGas(Attendant employee) {
        employee.changeGas();
    }

    void askToChangeGas(Storekeeper employee) {
        employee.changeGas();
    }

    void askForIngredients(Storekeeper employee) {
        employee.deliverIngredients();
    }
}
