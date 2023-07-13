public class RemoteControl implements Controller {
    private int volume;
    private boolean connected;
    private boolean playing;

    public RemoteControl() {
        this.volume = 50;
        this.connected = false;
        this.playing = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isConnected() {
        return connected;
    }

    private void setConnected(boolean connected) {
        this.connected = connected;
    }

    private boolean isPlaying() {
        return playing;
    }

    private void setPlaying(boolean playing) {
        this.playing = playing;
    }

    @Override
    public void connect() {
        this.setConnected(true);
    }

    @Override
    public void disconnect() {
        this.setConnected(false);
    }

    @Override
    public void openMenu() {
        if(this.isConnected()) {
            System.out.println("---------MENU---------");

            System.out.println("Está ligado? " + this.isConnected());

            if(this.isPlaying()) {
                System.out.println("Está tocando? " + this.isPlaying());
            } else {
                System.out.println("Está tocando? " + this.isPlaying());
            }

            System.out.print("Volume: " + this.getVolume());
            for(int i = 0; i <= this.getVolume(); i++) {
                System.out.print("°");
            }
            System.out.println();
        } else {
            System.out.println("Está ligado? " + this.isConnected());
        }
    }

    @Override
    public void closeMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void openMute() {
        if(this.isConnected() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void closeMute() {
        if(this.isConnected() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void moreVolume() {
        if(this.isConnected()) {
            this.setVolume(this.getVolume() + 1);
        } else {
            System.out.println("Está ligado? " + this.isConnected());
        }
    }
    
    @Override
    public void lessVolume() {
        if(this.isConnected()) {
            this.setVolume(this.getVolume() - 1);
        } else {
            System.out.println("Está ligado? " + this.isConnected());
        }
    }

    @Override
    public void play() {
        if(this.isConnected() && !(this.isPlaying())) {
            this.setPlaying(true);
        } else {
            System.out.println();
        }
    }

    @Override
    public void pause() {
        if(this.isConnected() && this.isPlaying()) {
            this.setPlaying(false);
        } else {
            System.out.println();
        }
    } 
}
