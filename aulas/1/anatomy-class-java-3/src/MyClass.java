public class MyClass {
    public static void main(String[] args) {
        // String myName = "Matheus";
        // int yearBirth = 1999;
        // boolean isLegalAge;
        // int currentYear = 2023;

        // int age = currentYear - yearBirth;

        // if(age >= 18) {
        //     isLegalAge = true;
        // } else {
        //     isLegalAge = false;
        // }

        // System.out.println("" + myName + " | " + "" + age + " | " + "" + isLegalAge);
        
        String firstName = "Matheus";
        String remainingName = "Fontinele Alves Vieira";

        String fullName = fullName(firstName, remainingName);

        System.out.println(fullName);
    }

    public static String fullName(String firstName, String remainingName) {
        return firstName.concat(" ").concat(remainingName);
    }
}
