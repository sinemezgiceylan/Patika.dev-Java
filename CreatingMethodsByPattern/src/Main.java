import java.util.Scanner;

public class Main {

    static void function() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int firstTemp = number;

        while (firstTemp > 0) {
            System.out.print(firstTemp + " ");
            firstTemp -= 5;

            if (firstTemp <= 0) {
                break;
            }
        }
        int lastTemp = firstTemp;

        while (lastTemp != number) {
            System.out.print(lastTemp + " ");
            lastTemp += 5;
        }

        System.out.print(number);


    }

    public static void main(String[] args) {
        function();
    }
}