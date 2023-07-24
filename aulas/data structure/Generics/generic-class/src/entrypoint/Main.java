package entrypoint;

import java.util.ArrayList;
import java.util.List;

import core.GenericType;
import entities.MenuItem;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> items = new ArrayList<>();
        GenericType<MenuItem> menu = new GenericType<>(items);

        addQuery(menu);
        printQuery(menu);
    }

    private static void addQuery(GenericType<MenuItem> menu) {
        menu.setMenu(new MenuItem("Pizza", 20, "Uma deliciosa pizza de pepperoni"));
        menu.setMenu(new MenuItem("Hamburguer", 15, "Um suculento hambúrguer com queijo cheddar"));
        menu.setMenu(new MenuItem("Suco", 5, "Um suco natural de laranja"));
    }
    
    private static void printQuery(GenericType<MenuItem> menu) {
        for(MenuItem item : menu.getMenu()) {
            System.out.println(item.getName());
        }
    }
}
