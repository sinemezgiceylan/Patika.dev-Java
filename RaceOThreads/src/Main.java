import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();
        int numbersSize = 2500;

        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        for (int i = 0; i < 4; i++) {
            int startIndex = i * numbersSize;
            int endIndex = startIndex + numbersSize;

            List<Integer> allNumbers = numbers.subList(startIndex, endIndex);

            Thread thread = new Thread(new NumberCalculator(allNumbers, evenNumbers, oddNumbers));
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Odd numbers: " + oddNumbers);
    }
}