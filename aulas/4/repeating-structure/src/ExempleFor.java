public class ExempleFor {
    public static void main(String[] args) {
        
        // for structure
        
        // for(int sheep = 1; sheep <= 20; sheep++) {
        //     System.out.println("Sheep number " + sheep);
        // }

        // ---------------------------------------------------------

        // what matters is only the conditional block

        // int sheep = 1;

        // for(; sheep <= 20;) {
        //     System.out.println("Sheep number " + sheep);

        //     sheep++;
        // }

        // ---------------------------------------------------------

        // For Each

        // String animals[] = {"cat", "dog", "bird"};
        
        // for(String animal : animals) {
        //     System.out.print(animal + ", ");
        // }

        // ---------------------------------------------------------

        // break

        // String locals[] = {"London", "Fortaleza", "Beijing", "Berlin", "Bangkok"};

        // for(String local : locals) {
        //     if(local == "Berlin") {
        //         break;
        //     }

        //     System.out.println(local + ", ");
        // }

        // ---------------------------------------------------------

        // continue

        for(int i = 1; i <= 50; i++) {
            if(i > 10 && i <= 39) {
                continue;
            }

            System.out.println(i);
        }
    }
}
