package LabWork.LabWork2_1_3;

import java.util.Scanner;

public class ComputerWork {

    public Computer[] createArrayObject() {

        Scanner sc = new Scanner(System.in);
        Computer[] computerArray = new Computer[2];

        for (int i = 0; i < computerArray.length; i++) {
            computerArray[i] = new Computer();
            System.out.println("Computer number: " + i);
            System.out.println("Enter manufacturer: ");
            computerArray[i].setManufacturer(sc.nextLine());
            System.out.println("Enter price");
            computerArray[i].setPrice(sc.nextFloat());
            System.out.println("Enter FrequenceCPU");
            computerArray[i].setFrequencyCPU(sc.nextInt());
            System.out.println("Enter QuantityCPU");
            computerArray[i].setQuantityCPU(sc.nextInt());
            System.out.println("Enter FrequenceCPU");
            computerArray[i].setFrequencyCPU(sc.nextInt());
        }
        System.out.println();
        return computerArray;
    }

}
