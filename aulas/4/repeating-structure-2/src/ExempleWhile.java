import java.util.concurrent.ThreadLocalRandom;

public class ExempleWhile {
    public static void main(String[] args) {
        double allowance = 50.0;

        while(allowance > 0) {
            double sweetValue = randomValue();

            if(sweetValue > allowance) {
                sweetValue = allowance;
            }

            System.out.println("Doce com o valor: R$ " + sweetValue + " Adicionado ao carrinho");
            
            allowance -= sweetValue;
        }

        System.out.println("Mesada: R$ " + allowance);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    public static double randomValue() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
