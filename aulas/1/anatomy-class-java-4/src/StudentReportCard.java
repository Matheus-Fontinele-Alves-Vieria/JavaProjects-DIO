public class StudentReportCard {
    public static void main(String[] args) {
        double finalMedia = 7.0;

        if(finalMedia < 7.0) {
            System.out.println("REPROVADO!");
        }
        else if(finalMedia == 7.0) {
            System.out.println("APROVADO MIDIOCREMENTE!");
        } else {
            System.out.println("APROVADO!");
        }
    }
}
