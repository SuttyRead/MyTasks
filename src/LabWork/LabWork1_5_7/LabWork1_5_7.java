package LabWork.LabWork1_5_7;

//////////////////////////////////////////////////////////////////
//Write a program that find and displays                        //
//all perfect numbers from 1 to n (perfect number               //
//is a positive integer that is equal to the sum                //
//of its proper positive divisors, excluding the number itself).//
//////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class LabWork1_5_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter end number: ");
        int endNumber = sc.nextInt();
        int p = 0;
        for (int i = 1; i < endNumber; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    p += j;
                }
            }
            if (i == p) {
                System.out.println(i);
            }
            p = 0;
        }
    }
}
