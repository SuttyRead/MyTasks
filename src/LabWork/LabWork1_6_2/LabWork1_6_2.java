package LabWork.LabWork1_6_2;

////////////////////////////////////////////////////////////////////////////////////////////////////
//There are statistics for the year by months as an array:                                        //
//int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };                            //
//Write code which calculates the maximum value from the array, the minimum value and the average.//
////////////////////////////////////////////////////////////////////////////////////////////////////

public class LabWork1_6_2 {

    public static void main(String[] args) {
        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int minimum = m[0];
        int maximum = m[0];
        int average;
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i];
            if (minimum > m[i]) {
                minimum = m[i];
            }
            if (maximum < m[i]) {
                maximum = m[i];
            }
        }
        average = sum / m.length;
        System.out.println("Minimum = " + minimum);
        System.out.println("Maximum = " + maximum);
        System.out.println("Average = " + average);
    }
}
