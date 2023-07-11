package soccer.team;

abstract class Player {
    private String name;
    private int number;

    protected Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public abstract void play();

    protected String getName() {
        return name;
    }

    protected int getNumber() {
        return number;
    }
}
