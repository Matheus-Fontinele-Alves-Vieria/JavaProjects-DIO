import java.util.Scanner;

public class Counter {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
		int parameterOne = scanner.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parameterTwo = scanner.nextInt();

        scanner.close();
    }
}
