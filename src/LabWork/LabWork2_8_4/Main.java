package LabWork.LabWork2_8_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 6;

        Shape[] shapes = new Shape[SIZE];

        shapes[0] = new Rectangle(3);
        shapes[1] = new Rectangle(6);
        shapes[2] = new Rectangle(3);
        shapes[3] = new Rectangle(3);
        shapes[4] = new Rectangle(8);
        shapes[5] = new Rectangle(6);

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].calculateArea();
        }

        Arrays.sort(shapes);
        System.out.println();
        System.out.println();
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }
    }
}
