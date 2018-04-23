package Exercise.Exercise_6;

import java.util.Scanner;

public class ArrayWork {
    public static int[] initializationArray() {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 10;
        int[] arr = new int[SIZE];
        System.out.println("Enter value array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int averageArray(int[] arr) {
        int average;
        int sum = 0;
        for (int anArr : arr) {
            sum += anArr;
        }
        average = sum / 10;
        System.out.println("Average = " + average);
        return average;
    }
}
