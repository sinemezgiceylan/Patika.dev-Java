import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random randomNumber = new Random();

        int matrix[][];
        int transpose[][];

        int row = randomNumber.nextInt(5) +1;
        int column = randomNumber.nextInt(5) +1;

        matrix = new int[row][column];

        transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = randomNumber.nextInt(5) + 1;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTranspose");
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }



    }
}