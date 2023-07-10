package cafeteria.area.client;

public class Client {
    public void chooseSnack() {
        System.out.println("ESCOLHENDO O LANCHE");
    }

    public void makeWish() {
        System.out.println("FAZENDO O PEDIDO");
    }

    public void payTheBill() {
        consultApplicationBalance();
        System.out.println("PAGANDO A CONTA");
    }

    private void consultApplicationBalance() {
        System.out.println("CONSULTANDO SALDO NO APLICATIVO");
    }

    public void pickUpCounterOrder() {
        System.out.println("PEGANDO O PEDIDO NO BALCÃO");
    }
}
