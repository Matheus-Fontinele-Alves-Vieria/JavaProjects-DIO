public interface Controller {
    public abstract void connect();
    public abstract void disconnect();
    public abstract void openMenu();
    public abstract void closeMenu();
    public abstract void moreVolume();
    public abstract void lessVolume();
    public abstract void openMute();
    public abstract void closeMute();
    public abstract void play();
    public abstract void pause();
}
