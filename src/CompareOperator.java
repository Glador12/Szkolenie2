public class CompareOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        System.out.println("czy x jest wiekszy od y?");
        boolean isXGreaterThenY = x > y;
        System.out.println(x>y);

        boolean xEqualsY = x != y;
        System.out.println("Czy x jest różny y");
        System.out.println(xEqualsY);
        System.out.println(!xEqualsY);

    }
}
