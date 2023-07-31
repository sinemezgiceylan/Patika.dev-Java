public class Main {
    public static void main(String[] args) {

        int[][] matrix = new int[1][2];
        int startI = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}