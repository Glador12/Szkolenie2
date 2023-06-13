public class cwiczonko {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println("czy x jest wieksze od y?");
        boolean xGreaterThanY = x > y;
        System.out.println(xGreaterThanY);

        System.out.println("czy x pomnozone przez 2 jest wieksze od y?");
        boolean xMultipliedGreaterThanY = (x*2) >y;
        System.out.println(xMultipliedGreaterThanY);

        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?");
        boolean duzoTekstu = y<(x + 3) && (y > x - 2);
        System.out.println(duzoTekstu);

        System.out.println("Czy iloczyn liczb x i y jest parzysty? ");
        boolean parzyste = ((x*y) % 2 == 0);
        System.out.println(parzyste);

    }
}
