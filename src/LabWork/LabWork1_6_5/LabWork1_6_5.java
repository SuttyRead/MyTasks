package LabWork.LabWork1_6_5;

/////////////////////////////////////
//Write a program, which transpose //
//matrix (2d arrays, size 4x4) and //
//outputs it to the console        //
/////////////////////////////////////

import java.util.Random;
import java.util.Scanner;

public class LabWork1_6_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        final int SIZE = 4;
        int arr[][] = new int[SIZE][SIZE];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = rand.nextInt(10);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + "\t");
            }
            System.out.println();
        }

    }
}
