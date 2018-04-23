package LabWork.LabWork1_5_2;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Write a program which prompts user for the number "x", reads it from the keyboard, and saves it in an int variable called "x".//
//        Then prints "One", "Two",... , "Nine" if the variable "x" is 1, 2,... , 9 and "Other" if x >9, respectively.          //
//        Use:  (a) a "nested-if" statement;                                                                                    //
//        (b) a "switch-case" statement.                                                                                        //
//        The output shall look like (user input – in green):                                                                   //
//        -Enter number x: 1			-Enter number x: 12                                                                     //
//        -One					- Other                                                                                         //
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class LabWork1_5_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x;
        x = sc.nextInt();
        if (x == 1) {
            System.out.println("One");
        } else if (x == 2) {
            System.out.println("Two");
        } else if (x == 3) {
            System.out.println("Three");
        } else if (x == 4) {
            System.out.println("Four");
        } else if (x == 5) {
            System.out.println("Five");
        } else if (x == 6) {
            System.out.println("Six");
        } else if (x == 7) {
            System.out.println("Seven");
        } else if (x == 8) {
            System.out.println("Eight");
        } else if (x == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("Other");
        }
    }
}
