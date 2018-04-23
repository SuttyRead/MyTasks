package LabWork.LabWork1_6_6;

/////////////////////////////////////////////////////////
// Write a program that sorts an array of average      //
// temperature values by months of 2015 as follows:    //
// at first the negative values, then - positive values//
/////////////////////////////////////////////////////////

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LabWork1_6_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        double[] monthT = new double[12];
        monthT[0] = -6.6;
        monthT[1] = -5.7;
        monthT[2] = -0.9;
        monthT[3] = 6.6;
        monthT[4] = 12.5;
        monthT[5] = 15.3;
        monthT[6] = 17.3;
        monthT[7] = 17.4;
        monthT[8] = 11.9;
        monthT[9] = 5.4;
        monthT[10] = 1.1;
        monthT[11] = -3.6;
        Arrays.sort(monthT);
        System.out.println(Arrays.toString(monthT));
    }
}
