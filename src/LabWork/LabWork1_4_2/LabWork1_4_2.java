package LabWork.LabWork1_4_2;

////////////////////////////////////////////////////
//Write a console program that prints result      //
//of each of arithmetic operations (+, -, /, *, %)//
// for two variables of primitive data types.     //
////////////////////////////////////////////////////

public class LabWork1_4_2 {

    public static void main(String[] args) {

        int a = 19;
        int b = 17;

        int sum = a + b;
        int difference = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulo = a % b;

        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + difference);
        System.out.println("a * b = " + multiplication);
        System.out.println("a / b = " + division);
        System.out.println("a % b = " + modulo);
    }
}
