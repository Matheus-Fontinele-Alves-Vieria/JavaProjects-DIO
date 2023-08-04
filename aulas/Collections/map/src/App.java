import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
 * Depois, mostre quantas vezes cada valor foi conseguido.
 */

public class App {
    public static void main(String[] args) throws Exception {
        int numberOfReleases = 100;

        List<Integer> values = new ArrayList<>();

        Random generator = new Random();

        for(int i = 0; i < numberOfReleases; i++) {
            int number = generator.nextInt(6) + 1;
            values.add(number);
        }

        Map<Integer, Integer> releases = new HashMap<>();

        for(Integer result : values) {
            if(releases.containsKey(result)) {
                releases.put(result, (releases.get(result) + 1));
            } else {
                releases.put(result, 1);
            }
        }

        System.out.println("Joagando...");

        for(int i = 0; i < 3; i++) {
            try {
                Thread.sleep(3000);
                System.out.print("*");
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nValor " + " Quantidade de vezez");
        for(Map.Entry<Integer, Integer> entry : releases.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }
    }
}
