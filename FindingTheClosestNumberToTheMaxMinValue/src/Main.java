import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -788, 2, 0};

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int inputNumber = input.nextInt();
        int min = inputNumber;
        int max = inputNumber;
        Arrays.sort(list);

        for (int i : list) {
            if (i > inputNumber) {
                max = i;
                break;
            }
        }

        for (int i = list.length -1 ; i >= 0; i--) {
            if (list[i] < inputNumber) {
                min = list[i];
                break;
            }
        }

        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);



    }
}