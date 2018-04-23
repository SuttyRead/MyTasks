package LabWork.LabWork1_6_4;

/////////////////////////////////////////
//Write a program, which uses a binary //
//search in a sorted array of integer  //
//numbers to find a certain element.   //
/////////////////////////////////////////

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LabWork1_6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        final int SIZE = 10;
        int[] arr = new int[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int searchValue = 0;
        int retValue = Arrays.binarySearch(arr, searchValue);
        System.out.println(retValue);
    }
}
