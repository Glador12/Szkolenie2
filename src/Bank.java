public class Bank {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "21376942011";
        Address address1 = new Address();
        address1.city = "Warszawa";
        address1.postalCode = " 20-211";
        address1.street = "Troniarza";
        address1.home = 21;
        address1.flat = 37;
        person1.registeredAddress = address1;
        person1.livingAddress = address1;
        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;

        Person person2 = new Person();
        person2.firstName = "Marta";
        person2.lastName = "Kowalska";
        person2.pesel = "11024967312";
        person2.registeredAddress = new Address();
        person2.registeredAddress.city = "Kraków";
        person2.registeredAddress.postalCode= "21-373";
        person2.registeredAddress.street =" Lotusiarza";
        person2.registeredAddress.home = 69;
        person2.registeredAddress.flat = 7



    }
}
