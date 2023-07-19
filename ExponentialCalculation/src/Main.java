public class Main {

    public static int exponential(int base, int exponent) {

        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(exponential(2,5));
    }
}