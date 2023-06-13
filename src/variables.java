public class variables {
    public static void main(String[] args) {
        var firstName = "Jan";
        String lastName = "kowalski";
        int age = 25;
        double height = 170;
        final String pesel = "213769420";


        System.out.println(firstName + " " + lastName + " " + "ma" +" " + age + " " + "lat");
        System.out.println(firstName + " " + lastName + " " + "ma pesel" +" " + pesel);
        System.out.println(firstName + " " + lastName + " " + "ma wzrost" + " " + height + "cm");
        System.out.println(firstName + " " + lastName + " " + "nienawidzi graczy bogli");
        firstName ="Krzysztof";
        System.out.println("imie po zmianie " + firstName);

    }
}

