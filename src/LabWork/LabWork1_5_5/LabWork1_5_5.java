package LabWork.LabWork1_5_5;

//////////////////////////////////////////////////////////////////////////////
//Write a program to produce the sum of 1, 2, 3, ..., to an upper bound - n.//
//        Also compute and display the average.                             //
//        The output shall look like:                                       //
//        The Sum is: 100                                                   //
//        The Avg is: 10                                                    //
//////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class LabWork1_5_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity of numbers: ");
        int quantity = sc.nextInt();
        int sum = 0;
        double averageValue = 0;
        for (int i = 0; i < quantity; i++) {
            sum += i;
            averageValue = (double) sum / (double) quantity;
        }
        System.out.println("sum = " + sum);
        System.out.println("AverageValue = " + averageValue);
    }
}
