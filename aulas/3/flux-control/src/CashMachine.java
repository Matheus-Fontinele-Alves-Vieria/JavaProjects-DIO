public class CashMachine {
    public static void main(String[] args) {
        double balance = 25.0;
        double requestedBalance = 17.0;

        if(requestedBalance < balance) {
            balance -= requestedBalance;
        }

        System.out.println(balance);
    }
}
