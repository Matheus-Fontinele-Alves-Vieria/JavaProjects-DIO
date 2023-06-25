import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);  
        
        int age = 0;
        double height = 0;
        float weight = 0;

        System.out.print("Digite o seu nome: ");
        String name = scanner.next();

        System.out.print("Digite o seu sobrenome: ");
        String lastName = scanner.next();

        System.out.print("Digite a sua idade: ");
        try {
            age = scanner.nextInt();
        } catch(InputMismatchException e) {
            System.err.println("Erro! Digite um número inteiro válido");
            scanner.nextLine();
        } finally {
            
        }

        System.out.print("Digite a sua altura: ");
        try {
            height = scanner.nextDouble();
        } catch(InputMismatchException e) {
            System.err.println("Erro! Digite uma altura válida (m)");
            scanner.nextLine();
        }

        System.out.print("Digite o seu peso: ");
        try {
            weight = scanner.nextFloat();
        } catch(InputMismatchException e) {
            System.err.println("Erro! Digite um peso válido (%)");
            scanner.nextLine();
        }
        
        scanner.close();

        System.out.println("\nOlá, " + name.toUpperCase() + " " + lastName.toUpperCase());
        if (age == 0) {
            System.out.println("Idade [campo não preenchido]");
        } else {
            System.out.println("Idade " + age + " anos");
        }
        if (height == 0) {
            System.out.println("Altura [campo não preenchido]");
        } else {
            System.out.println("Altura " + height + " m");
        }
        if (weight == 0) {
            System.out.println("Peso [campo não preenchido]");
        } else {
            System.out.println("Peso " + weight + " kg");
        }        
    }    
}
