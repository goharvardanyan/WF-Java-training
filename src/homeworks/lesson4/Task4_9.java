package homeworks.lesson4;

public class Task4_9 {
    public static void main(String[] args) {
        int[][] matrix = Task4_5.initializeRandomMatrix(10, 15);
        Task4_5.printMatrix(matrix);
        int[][] rotatedMatrix = rotateMatrix270(matrix);
        Task4_5.printMatrix(rotatedMatrix);
    }


    //4.9 Create matrix with dimensions 10x15 initialize with random ints in range 10 - 99
    //print it. Rotate it in 270* clockwise. Print the rotated matrix


    public static int[][] rotateMatrix270(int[][] matrix) {
        int[][] rotatedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                rotatedMatrix[i][j] = matrix[j][rotatedMatrix.length - 1 - i];
            }
        }
        return rotatedMatrix;
    }
}
