package homeworks.lesson4;

public class Task4_8 {
    public static void main(String[] args) {
        int[][] matrix = Task4_5.initializeRandomMatrix(10, 15);
        Task4_5.printMatrix(matrix);
        System.out.println();
        int[][] rotatedMatrix = rotateMatrix180(matrix);
        Task4_5.printMatrix(rotatedMatrix);

    }

    // 4.8 Create matrix with dimensions 10x15 initialize with random ints in range 10 - 99
    //print it. Rotate it in 180* clockwise. Print the rotated matrix

    public static int[][] rotateMatrix180(int[][] matrix) {
        int[][] rotatedMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                rotatedMatrix[i][j] = matrix[matrix.length - 1 - i][matrix[i].length - 1 - j];
            }
        }
        return rotatedMatrix;
    }
}
