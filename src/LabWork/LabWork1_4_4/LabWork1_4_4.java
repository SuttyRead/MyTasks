package LabWork.LabWork1_4_4;

//////////////////////////////////////////////
//Write a console program that prints result//
//of increment and decrement in prefix and  //
//postfix mode for integer variable.        //
//////////////////////////////////////////////

public class LabWork1_4_4 {

    public static void main(String[] args) {
        int postfixInc = 0;
        int prefixInc = 0;
        int postfixDec = 0;
        int prefixDec = 0;
        System.out.println("increment postfix: " + postfixInc++);
        System.out.println("increment prefix: " + ++prefixInc);
        System.out.println("Decrement postfix: " + postfixDec--);
        System.out.println("Decrement prefix: " + --prefixDec);
    }
}
