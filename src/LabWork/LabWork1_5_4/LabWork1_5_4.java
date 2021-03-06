package LabWork.LabWork1_5_4;

///////////////////////////////////////////////////////////////////
//The program must print the first 10 numbers that is            //
//divisible evenly by 3 or 4, but for loop iterates from 1 to 300//
//(so break statement must be used after 10 printed result).     //
//        The output shall look:                                 //
//        3                                                      //
//        4                                                      //
//        …                                                      //
//        20                                                     //
///////////////////////////////////////////////////////////////////

public class LabWork1_5_4 {

    public static void main(String[] args) {
        int quantity = 0;
        for (int i = 0; i < 300; i++) {
            if (quantity > 10) {
                break;
            }
            if (i % 3 == 0 || i % 4 == 0) {
                quantity++;
                System.out.println(i);
            }
        }
    }
}

