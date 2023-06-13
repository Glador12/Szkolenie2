public class vat {
    public static void main(String[] args) {

        double netto = 1654;
        double stawkaVat = 0.23;
        double vat = netto * stawkaVat;
        double brutto = netto + vat;

        System.out.println("cena netto:" + netto);
        System.out.println("stawka vat:" + stawkaVat);
        System.out.println("vat:" + vat);
        System.out.println("cena brutto:" + brutto);

    }
}
