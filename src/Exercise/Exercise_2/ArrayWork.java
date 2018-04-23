package Exercise.Exercise_2;

import java.util.Scanner;

public class ArrayWork {
    Scanner sc = new Scanner(System.in);

    public double[] initializationArray() {
        final int SIZE = 10;
        double[] arr = new double[SIZE];
        System.out.println("Enter array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public double upperElementArray10(double[] arr) {
        System.out.println("Enter index element: ");
        int tempIndexElement = sc.nextInt();
        double tempValueElement = arr[tempIndexElement];
        tempValueElement *= 1.1;
        return tempValueElement;
    }
}
