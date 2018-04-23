package LabWork.LabWork2_4_5;

public class MyCalc {

    public double calcPi(int n) {
        double PI = 4d;
        double j = 3;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                PI -= 4 / j;
                j += 2;
            } else {
                PI += 4 / j;
                j += 2;
            }

        }
        System.out.println(PI);

        return PI;
    }

}
