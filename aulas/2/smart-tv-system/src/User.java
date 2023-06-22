public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.on);
        System.out.println("Canal atual? " + smartTv.chanel);
        System.out.println("Volume atual? " + smartTv.volume);
    }
}
