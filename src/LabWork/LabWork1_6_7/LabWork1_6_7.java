package LabWork.LabWork1_6_7;

////////////////////////////////////////
// Write a program, which finds       //
// in a given matrix the area of      //
// equal numbers. Here is one example //
// with an area containing 7 elements //
// with equal value of 1:             //
////////////////////////////////////////

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LabWork1_6_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        final int length = 4;
        final int width = 5;
        int[][] matrix = new int[length][width];

        matrix[0][0] = 1;
        matrix[0][1] = 1;
        matrix[0][2] = 1;
        matrix[0][3] = 3;
        matrix[0][4] = 4;
        matrix[1][0] = 2;
        matrix[1][1] = 1;
        matrix[1][2] = 3;
        matrix[1][3] = 1;
        matrix[1][4] = 2;
        matrix[2][0] = 2;
        matrix[2][1] = 2;
        matrix[2][2] = 3;
        matrix[2][3] = 4;
        matrix[2][4] = 1;
        matrix[3][0] = 3;
        matrix[3][1] = 3;
        matrix[3][2] = 3;
        matrix[3][3] = 1;
        matrix[3][4] = 4;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //Wrong working
        int searchValue = 1;
        int retValue = Arrays.binarySearch(matrix[0], searchValue);
        System.out.println(retValue);
        int retValue2 = Arrays.binarySearch(matrix[1], searchValue);
        System.out.println(retValue2);
        int retValue3 = Arrays.binarySearch(matrix[2], searchValue);
        System.out.println(retValue3);
        int retValue4 = Arrays.binarySearch(matrix[3], searchValue);
        System.out.println(retValue4);
    }
}
