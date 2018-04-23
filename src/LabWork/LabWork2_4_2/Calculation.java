package LabWork.LabWork2_4_2;

import java.util.Scanner;

public class Calculation {

    private int[] arr;

    public int[] createArray() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Enter array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
