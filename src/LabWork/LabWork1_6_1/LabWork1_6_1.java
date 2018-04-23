package LabWork.LabWork1_6_1;

///////////////////////////////////////////
//Create an array of all the even numbers//
//from 2 to 30 (2,4,6...30) and display  //
//elements of the array to the screen.   //
///////////////////////////////////////////

public class LabWork1_6_1 {

    public static void main(String[] args) {
        int[] mas = new int[15];
        int j = 2;
        for (int i = 0; j < 31; i++) {
            mas[i] = j;
            j += 2;
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
}
