package LabWork.LabWork2_2_1;

import java.util.Random;
import java.util.Scanner;

public class MatrixWork {
    public int[][] createMatrix(int sizeMatrix) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Rand = 0 or personal = 1");
        int k = sc.nextInt();
        Random rand = new Random();
        int[][] matrix = new int[sizeMatrix][sizeMatrix];
        if (k == 0) {
            for (int i = 0; i < sizeMatrix; i++) {
                for (int j = 0; j < sizeMatrix; j++) {
                    matrix[i][j] = rand.nextInt(10);
                }
            }
        }
        if (k == 1) {
            for (int i = 0; i < sizeMatrix; i++) {
                for (int j = 0; j < sizeMatrix; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
        }
        return matrix;
    }

    public int[][] createMatrix2(int sizeMatrix) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Rand = 0 or personal = 1");
        int k = sc.nextInt();
        Random rand = new Random();
        int[][] matrix = new int[sizeMatrix][sizeMatrix];
        if (k == 0) {
            for (int i = 0; i < sizeMatrix; i++) {
                for (int j = 0; j < sizeMatrix; j++) {
                    matrix[i][j] = rand.nextInt(10);
                }
            }
        }
        if (k == 1) {
            for (int i = 0; i < sizeMatrix; i++) {
                for (int j = 0; j < sizeMatrix; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
        }
        return matrix;
    }

    public int[][] operationMatrixAdd(int[][] matrix, int[][] matrix2) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] += matrix2[i][j];
            }
        }
        return matrix;
    }

    public int[][] operationMatriMultiplication(int[][] matrix, int[][] matrix2) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] *= matrix2[i][j];
            }
        }
        return matrix;
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
