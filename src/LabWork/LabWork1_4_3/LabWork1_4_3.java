package LabWork.LabWork1_4_3;

///////////////////////////////////////////////////////
//Write a console program that prints result of each //
//of arithmetic logical(AND,OR,NOT,XOR)              //
//for two variables of boolean data type.            //
///////////////////////////////////////////////////////

public class LabWork1_4_3 {

    public static void main(String[] args) {

        int a = 8;
        int b = 9;
        //Operation AND
        if (a < 10 && b > 5) {
            System.out.println("Operation \"AND\" TRUE");
        } else {
            System.out.println(("Operation \"AND\" FALSE"));
        }
        //Operation OR
        if (a < 15 || b > 10) {
            System.out.println("Operation \"OR\" TRUE");
        } else {
            System.out.println(("Operation \"OR\" FALSE"));
        }
        //Operation NOT
        if (a != 5) {
            System.out.println("Operation \"NOT\" TRUE");
        } else {
            System.out.println(("Operation \"NOT\" FALSE"));
        }
        //Operation XOR


    }
}
