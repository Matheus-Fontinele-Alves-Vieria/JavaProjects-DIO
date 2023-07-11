package soccer.team;

public class Goalkeeper extends Player {
    public Goalkeeper(String name, int number) {
        super(name, number);
    }

    @Override
    public void play() {
        System.out.println(getName() + " está defendendo o gol!");
    }
}
