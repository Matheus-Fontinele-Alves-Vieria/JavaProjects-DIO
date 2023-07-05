import java.util.Scanner;

class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
		int parameterOne = scanner.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parameterTwo = scanner.nextInt();

        scanner.close();

        try {
            counter(parameterOne, parameterTwo);
        } catch (InvalidParametersException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void counter(int parameterOne, int parameterTwo) throws InvalidParametersException {
        if(parameterOne > parameterTwo) {
            throw new InvalidParametersException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int counting = parameterTwo - parameterOne;

        for(int i = 1; i <= counting; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
