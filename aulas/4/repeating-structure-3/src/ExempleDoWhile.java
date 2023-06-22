import java.util.Random;

public class ExempleDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");
        } while(throwing());
    }

    public static boolean throwing() {
        boolean answered = new Random().nextInt(3) == 1;

        System.out.println("Atendeu? " + answered);

        return !answered;
    }
}
