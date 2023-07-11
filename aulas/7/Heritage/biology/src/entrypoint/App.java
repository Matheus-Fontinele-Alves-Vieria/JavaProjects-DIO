package entrypoint;

import entities.Human;
import entities.Cat;
import entities.Dog;

public class App {
    public static void main(String[] args) throws Exception {
        Human human = new Human();
        System.out.println("HUMANO:");
        System.out.println("Tem glândulas mamárias: " + human.mammaryGlands);
        System.out.println("Possui pêlos: " + human.hair);
        System.out.println("Fala: " + human.speaks);

        System.out.println();

        Cat cat = new Cat();
        System.out.println("GATO:");
        System.out.println("Tem glândulas mamárias: " + cat.mammaryGlands);
        System.out.println("Possui pêlos: " + cat.hair);
        System.out.println("Mia: " + cat.meow);

        System.out.println();

        Dog dog = new Dog();
        System.out.println("Cachorro:");
        System.out.println("Tem glândulas mamárias: " + dog.mammaryGlands);
        System.out.println("Possui pêlos: " + dog.hair);
        System.out.println("Late: " + dog.barks);
    }
}
