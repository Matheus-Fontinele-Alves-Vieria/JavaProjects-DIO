package entities;

import core.Animal;

public class Cat extends Animal {

    @Override
    public void query() {
        System.out.println("Consultando gato...");
    }
}
