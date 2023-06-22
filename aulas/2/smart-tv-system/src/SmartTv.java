public class SmartTv {
    boolean on = false;
    int chanel = 1;
    int volume = 25;

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public void increaseVolume() {
        volume++;
    }

    public void decreaseVolume() {
        volume--;
    }

    public void increaseChanel() {
        chanel++;
    }

    public void decreaseChanel() {
        chanel--;
    }

    public void changeChanel(int newChanel) {
        chanel = newChanel;
    }
}
