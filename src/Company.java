public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.firstName = "Jan";
        employee1.lastName = "Nowak";
        employee1.birthYear = 1999;
        employee1.seniority = 4;
        System.out.println("Pracownik1:");
        System.out.println(employee1.firstName + " " + employee1.lastName + " " + employee1.birthYear
                + " " + employee1.seniority);


        Employee employee2 = new Employee();
        employee2.firstName = "Andrzej";
        employee2.lastName = "Kowalski";
        employee2.birthYear = 1870;
        employee2.seniority = 30;
        System.out.println("Pracownik2:");
        System.out.println(employee2.firstName + " " + employee2.lastName + " " + employee2.birthYear
                + " " + employee2.seniority);

        Employee employee3 = new Employee();
        employee3.firstName = "Stefan";
        employee3.lastName = "Zarek";
        employee3.birthYear = 1997;
        employee3.seniority = 6;
        System.out.println("Pracownik3:");
        System.out.println(employee3.firstName + " " + employee3.lastName + " " + employee3.birthYear
                + " " + employee3.seniority);

    }
}
