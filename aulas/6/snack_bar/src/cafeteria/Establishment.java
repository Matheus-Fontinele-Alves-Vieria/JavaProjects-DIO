package cafeteria;

import cafeteria.service.kitchen.Chef;
// import cafeteria.service.kitchen.Storekeeper;
import cafeteria.service.Attendant;
import cafeteria.area.client.Client;

public class Establishment {
    public static void main(String[] args) {
        Chef chef = new Chef();

        // actions that don't need to be available to the entire application
            // chef.selectSnackIngredients();
            // chef.washIngredients();
            // chef.selectCoffeeIngredients();
            // chef.strainCoffee();
            // chef.prepareCombo();

        // actions that establishment needs to be aware of
        chef.addComboAtTheCounter();

        // Storekeeper storekeeper = new Storekeeper();

        // actions that don't need to be available to the entire application
            // storekeeper.controlInput();
            // storekeeper.controlOutput();

        // action that only your kitchen package needs to know
            // storekeeper.deliverIngredients();
            // storekeeper.changeGas();

        Attendant attendant = new Attendant();

        attendant.grabKitchenSnack();
        attendant.servingTable();

        // action that only your kitchen package needs to know
            // attendant.changeGas();

        Client client = new Client();

        client.chooseSnack();
        client.makeWish();

        // this action is very confidential
            // client.consultApplicationBalance();

        client.payTheBill();
    }
}
