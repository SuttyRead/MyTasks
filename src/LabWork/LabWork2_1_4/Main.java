package LabWork.LabWork2_1_4;

//Write a program that iterate through
//array of Computer objects and increases
//by 10 percent field price.

public class Main {

    public static void main(String[] args) {
        ComputerWork computerWork = new ComputerWork();
        Computer computer = new Computer();
        computerWork.upperPrice10(computerWork.createArrayObject());
    }
}
