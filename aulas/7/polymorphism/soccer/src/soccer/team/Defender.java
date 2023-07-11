package soccer.team;

public class Defender extends Player {
    public Defender(String name, int number) {
        super(name, number);
    }

    @Override
    public void play() {
        System.out.println(getName() + " está defendendo!");
    }
}
