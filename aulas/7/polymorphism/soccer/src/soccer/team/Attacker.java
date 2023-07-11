package soccer.team;

public class Attacker extends Player {
    public Attacker(String name, int number) {
        super(name, number);
    }

    @Override
    public void play() {
        System.out.println(getName() + " está atacando!");
    }
}
