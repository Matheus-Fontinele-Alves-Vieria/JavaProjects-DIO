public class App {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.connect();
        remoteControl.play();
        
        int contLess = 50;
        while(contLess >= 15) {
            remoteControl.lessVolume();

            contLess--;
        }

        remoteControl.openMenu();
        remoteControl.closeMenu();
    }
}
