package LabWork.LabWork2_4_6;

public class MyPiramid {

    public static void printPiramid(int h) {
        int o = 0;
        int temp = 1;
        int l = 1;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h * 2 - 1; j++) {
                System.out.print(" ");

                if (j == h - i) {
                    for (int k = 0; k < temp; k++) {
                        o += l;
                        if (o == i + 1) {
                            l = -1;
                        }
                        System.out.print(o);
                    }
                }
            }
            l = 1;
            temp += 2;
            System.out.println();
            o = 0;
        }
    }
}
