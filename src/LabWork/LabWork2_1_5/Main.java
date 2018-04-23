package LabWork.LabWork2_1_5;

//Add to class Computer method void view(){} that prints all fields of object in line.
//Print all info (fields) of all objects in console.

public class Main {

    public static void main(String[] args) {
        ComputerWork computerWork = new ComputerWork();
        Computer computer = new Computer();
        computerWork.show(computerWork.upperPrice10(computerWork.createArrayObject()));
    }
}
