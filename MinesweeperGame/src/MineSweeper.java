import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    Scanner input = new Scanner(System.in);
    Random random = new Random();
    String[][] area;
    String[][] selectedArea;
    int row;
    int column;
    int mines;

    public MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void run() {

        area = new String[row][column];
        selectedArea = new String[row][column];

        mines = (row * column) / 4;

        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area.length; j++) {

                area[i][j] = "-";
                selectedArea[i][j] = "-";
            }
        }

        while (mines > 0) {

            int i = random.nextInt(row);
            int j = random.nextInt(column);

            if (area[i][j].equals("-")) {
                area[i][j] = "*";
                mines--;
            }
        }

        printSelectedArea();

        play();
    }

    public void play() {

        boolean isContinue = false;

        while (!isContinue) {
            System.out.print("Satır numarası giriniz: ");
            int selectedRow = input.nextInt();
            System.out.print("Sütun numarası giriniz: ");
            int selectedColumn = input.nextInt();

            int number = 0;

            if (selectedRow < row && selectedColumn < column) {
                if (area[selectedRow][selectedColumn].equals("-")
                        && selectedArea[selectedRow][selectedColumn].equals("-")) {
                    for (int i = selectedRow - 1; i <= selectedRow - 1; i++) {
                        for (int j = selectedColumn - 1; j <= selectedColumn - 1; j++) {
                            area[i][j].equals("*");
                                number ++;
                                selectedArea[selectedRow][selectedColumn] = Integer.toString(number);
                        }
                    }

                    printSelectedArea();

                    if (!isWin()) {
                        System.out.println("Kazandınız!");
                        printArea();
                        isContinue = true;
                    }
                } else if (area[selectedRow][selectedColumn].equals("*")) {
                    System.out.println("Kaybettiniz!");
                    printArea();
                    isContinue = true;
                } else if (!area[selectedRow][selectedColumn].equals("-")) {
                    System.out.println("Bu alan daha önce seçildi!");
                }

            } else {
                System.out.println("Alan dışı seçim yaptınız!");
            }
        }

    }

    public void printArea() {
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area.length; j++) {
                System.out.print(area[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printSelectedArea() {
        for (int i = 0; i < selectedArea.length; i++) {
            for (int j = 0; j < selectedArea.length; j++) {
                System.out.print(selectedArea[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isWin(){
        int counter = 0;
        int mines = 0;

        for (int i=0;i<selectedArea.length;i++){
            for (int j=0; j<selectedArea[i].length;j++){

                if (selectedArea[i][j].equals("-")){
                    counter++;
                }if (area[i][j].equals("*")){
                    mines++;
                }
            }
        }
        if (mines == counter){
            return false;
        }
        return true;
    }
}
