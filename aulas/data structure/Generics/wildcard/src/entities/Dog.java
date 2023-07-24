package entities;

import core.Animal;

public class Dog extends Animal {

    @Override
    public void query() {
        System.out.println("Consultando cachorro...");
    }
}
