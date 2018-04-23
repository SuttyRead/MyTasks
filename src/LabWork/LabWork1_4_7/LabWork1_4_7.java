package LabWork.LabWork1_4_7;

////////////////////////////////////////////
//Write a console program that prints     //
//        result of Ternary operator for  //
//        integer variable initialization.//
////////////////////////////////////////////

import java.util.Scanner;

public class LabWork1_4_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        System.out.println(number >= 10 ? "number more and equal 10" : "number less 10");

    }
}
