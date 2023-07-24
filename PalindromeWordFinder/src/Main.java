import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return str.equals(reverse);
    }


    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String word = input.nextLine();

        System.out.println(isPalindrome(word));

    }


}