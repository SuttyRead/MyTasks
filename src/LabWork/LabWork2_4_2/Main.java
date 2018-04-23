package LabWork.LabWork2_4_2;

//Create class Calculation, which will create two
//arrays of integers and use findMin and findMax
//static methods of MyMath class.

public class Main {
    public static void main(String[] args) {

        MyMath myMath = new MyMath();
        Calculation first = new Calculation();
        Calculation second = new Calculation();

        first.setArr(first.createArray());
        second.setArr(first.createArray());

        first.printArray(first.getArr());
        second.printArray(second.getArr());


        System.out.println("Maximum(arr2) = " + myMath.findMax(first.getArr()));
        System.out.println("Minimum(arr2) = " + myMath.findMin(first.getArr()));
        System.out.println("Maximum(arr3) = " + myMath.findMax(second.getArr()));
        System.out.println("Minimum(arr3) = " + myMath.findMin(second.getArr()));

    }
}
