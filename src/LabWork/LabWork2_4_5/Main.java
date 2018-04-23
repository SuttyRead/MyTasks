package LabWork.LabWork2_4_5;

//The value of π can be calculated with the series:
//π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
//Write a class MyCalc with public static method
//calcPi(int) that takes as parameter an integer n, and computes
//and returns the value of π approximated to the first n t
//erms of the series.

public class Main {
    public static void main(String[] args) {
        MyCalc myCalc = new MyCalc();
        myCalc.calcPi(10000);
    }
}
