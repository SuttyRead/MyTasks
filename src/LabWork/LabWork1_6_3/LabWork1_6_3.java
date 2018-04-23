package LabWork.LabWork1_6_3;

import java.util.Random;
import java.util.Scanner;

public class LabWork1_6_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        final int SIZE = 5;
        int matrix[][] = new int[SIZE][SIZE];

        // initialization array
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = rand.nextInt(15);
            }
        }
        // output array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        // Output main diagonal in array
        System.out.println("Main diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" ");
                if (i == j) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }

        System.out.println();

        // conclusion collateral diagonal in array
        System.out.println("Collateral diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" ");
                if (j == matrix.length - i - 1) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }

        System.out.println();

        // output above the top diagonal
        System.out.println("Output above the top diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" ");
                if (j < i) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }

        System.out.println();

        // output belowe the top diagonal
        System.out.println("Output belowe the top diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" ");
                if (j > i) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //output above collateral diagonal in array
        System.out.println("Output above collateral diagonal in array: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j >= matrix.length - i) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();
        //output above collateral diagonal in array
        System.out.println("Output above collateral diagonal in array: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - i - 1; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
        }

        System.out.println();

        System.out.println("Output");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j >= matrix.length - i && j > i) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
        }
    }
}
