public class Main {

    static boolean isPolindrom(int number) {

        int tempNumber = number, reverseNumber = 0, lastNumber;

        while (tempNumber != 0) {
            lastNumber = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            tempNumber /= 10;
        }

        if (number == reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        System.out.println(isPolindrom(111));
        System.out.println(isPolindrom(1112));
    }
}