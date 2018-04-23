package LabWork.LabWork2_2_2;

public class Matrix {
    MatrixWork matrixWork = new MatrixWork();

    public void printMatrixvalue(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
