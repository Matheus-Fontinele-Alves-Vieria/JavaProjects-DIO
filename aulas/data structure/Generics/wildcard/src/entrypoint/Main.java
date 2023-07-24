package entrypoint;

import java.util.ArrayList;
import java.util.List;

import core.Animal;
import entities.Cat;
import entities.Dog;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());
        printQuery(dogs);
        printQuery(cats);

        List<Animal> animals = new ArrayList<>();
        addQuery(animals);

        printQuery(animals);
    }

    private static void printQuery(List<? extends Animal> animals) {
        for(Animal animal : animals) {
            animal.query();
        }
    }

    private static void addQuery(List<? super Animal> animals) {
        animals.add(new Dog());
        animals.add(new Cat());
    }
}
