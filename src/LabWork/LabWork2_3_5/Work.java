package LabWork.LabWork2_3_5;

import java.util.Scanner;

public class Work {

    public void initial(MyWindow myWindow) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter firstname: ");
        myWindow.setFirstName(sc.nextLine());
        System.out.print("Enter lasttname: ");
        myWindow.setLastName(sc.nextLine());
        System.out.print("Enter age: ");
        myWindow.setAge(sc.nextInt());
        System.out.print("Enter growth: ");
        myWindow.setGrowth(sc.nextInt());
        System.out.print("Enter weight: ");
        myWindow.setWeight(sc.nextInt());
    }

    public void printFields(MyWindow myWindow) {
        System.out.println("Firstname: " + myWindow.getFirstName());
        System.out.println("Lastname: " + myWindow.getLastName());
        System.out.println("Age: " + myWindow.getAge());
        System.out.println("Growth: " + myWindow.getGrowth());
        System.out.println("Weight: " + myWindow.getWeight());

    }
}
