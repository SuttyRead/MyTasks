package LabWork.LabWork1_5_1;

//////////////////////////////
//Write a program to produce//
//on console the following ://
//1                         //
//2 1                       //
//3 2 1                     //
//4 3 2 1                   //
//5 4 3 2 1                 //
//6 5 4 3 2 1               //
//7 6 5 4 3 2 1             //
//8 7 6 5 4 3 2 1           //
//////////////////////////////

import java.util.Scanner;

public class LabWork1_5_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 9; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
