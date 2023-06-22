public class AverageSystem {
    public static void main(String[] args) {
        char acronym = 'M';

        // if/else
        // if(acronym == 'P') {
        //     System.out.println("Pequeno");
        // }
        // else if(acronym =='M') {
        //     System.out.println("Médio");
        // }
        // else if(acronym == 'G') {
        //     System.out.println("Grande");
        // } else {
        //     System.out.println("Indefinido");
        // }

        // switch/case
        switch(acronym) {
            case 'P':
            System.out.println("Pequeno");
            break;

            case 'M':
            System.out.println("Médio");
            break;

            case 'G':
            System.out.println("Grande");
            break;

            default:
            System.out.println("Indefinido");
        }
    }
}
