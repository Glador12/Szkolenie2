public class MathOperators {
    public static void main(String[] args) {
        int x = 22;
        int y = 2;

        int sum = x + y;

        System.out.println(sum); //14
        System.out.println(x - y); //6
        System.out.println(x * y); //40
        System.out.println(x / y); //2
        System.out.println(x % y); //3

        y *= 5;
        System.out.println("Nowy Y:" + y);

    }
}
