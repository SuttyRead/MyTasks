package LabWork.LabWork1_5_6;

///////////////////////////////////
//Write a program that calculates//
//and displays the sum of squares//
//of digits of number            //
///////////////////////////////////

import java.util.Scanner;

public class LabWork1_5_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter number: ");
        String number = sc.nextLine();
        String[] numberMas = number.split("");
        int[] numberMasInt = new int[numberMas.length];

        for (int i = 0; i < numberMas.length; i++) {
            numberMasInt[i] = Integer.parseInt(numberMas[i]);
        }

        for (int i = 0; i < numberMasInt.length; i++) {
            sum += numberMasInt[i] * numberMasInt[i];
        }
        System.out.println(sum);
    }
}




