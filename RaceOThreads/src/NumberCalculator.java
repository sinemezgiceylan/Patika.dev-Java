import java.util.List;

public class NumberCalculator implements Runnable{

    private List<Integer> allNumbers;
    private List<Integer> evenNumbers;
    private List<Integer> oddNumbers;

    public NumberCalculator(List<Integer> allNumbers, List<Integer> evenNumbers, List<Integer> oddNumbers) {
        this.allNumbers = allNumbers;
        this.evenNumbers = evenNumbers;
        this.oddNumbers = oddNumbers;
    }

    @Override
    public void run() {
        for (Integer number : allNumbers) {
            if (number % 2 == 0) {
                synchronized (evenNumbers) {
                    evenNumbers.add(number);
                }
            } else {
                synchronized (oddNumbers) {
                    oddNumbers.add(number);
                }
            }
        }

    }
}
