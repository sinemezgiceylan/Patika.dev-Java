import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random randomNumber = new Random();
        int number = randomNumber.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selectedNumber;
        int[] wrong = new int[5];
        boolean isWrong = false;
        boolean isWin = false;

        while (right < 5) {
            System.out.println("0 ile 100 arasında bir sayı giriniz: ");
            selectedNumber = input.nextInt();

            if (selectedNumber < 0 || selectedNumber > 100) {
                System.out.println("Hatalı sayı girişi!\nLütfen 0 ile 100 arasında bir sayı giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Birden fazla hatalı giriş yaptınız!\nKalan hakkınız: " + (5 - right));

                } else {
                    isWrong = true;
                    System.out.println("Bir sonraki hatalı girişte hakkınız eksilecektir.");
                }
                continue;
            }

            if (selectedNumber == number) {
                System.out.println("Tebrikler, doğru tahmin!");
                for (int value : wrong) {
                    if (value != 0) {
                        System.out.println("Tahminleriniz: " + value + ", ");
                    }
                }
            } else {
                System.out.println("Yanlış tahmin!");

                if (selectedNumber > number) {
                    System.out.println(selectedNumber + " sayısı gizli sayıdan bütüktür.");
                } else {
                    System.out.println(selectedNumber + " sayısı gizli sayıdan küçüktür.");
                }

                wrong[right++] = selectedNumber;
                System.out.println("Kalan hakkınız: " + (5 - right));
                for (int value : wrong) {
                    if (value != 0) {
                        System.out.println("Tahminleriniz: " + value);
                    }
                }

            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz!");
            System.out.println("Sayı: " + number);
        }
    }
}