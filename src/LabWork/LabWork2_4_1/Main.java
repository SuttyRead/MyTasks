package LabWork.LabWork2_4_1;

//Create class MyMath with two static methods (findMin and findMax),
//which will take array of int values  as argument and return minimum
//element value (for findMin method) or  maximum element value (for findMax method).

public class Main {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(myMath.findMax(arr));
        System.out.println(myMath.findMin(arr));

    }
}
