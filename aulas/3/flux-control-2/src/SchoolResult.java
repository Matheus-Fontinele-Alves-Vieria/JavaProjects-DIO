public class SchoolResult {
    public static void main(String[] args) {
        double note = 6.5;

        // if(note >= 7.0) {
        //     System.out.println("APROVADO");
        // } 
        // else if(note >= 5.0 && note < 7.0) {
        //     System.out.println("RECUPERAÇÃO");
        // } else {
        //     System.out.println("REPROVADO");
        // }

        String result = note >= 7.0 ? "APROVADO" : note >= 5.0 && note < 7.0 ? "RECUPERAÇÃO" : "REPROVADO";

        System.out.println(result);
    }
}
