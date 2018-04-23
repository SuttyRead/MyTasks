package LabWork.LabWork2_8_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 10;

        Shape[] shapes = new Shape[SIZE];

        shapes[0] = new Rectangle("red", 3, 6);
        shapes[1] = new Rectangle("blue", 3, 6);
        shapes[2] = new Triangle("green", 3, 5, 8);
        shapes[3] = new Triangle("black", 3, 6, 5);
        shapes[4] = new Circle("white", 3);
        shapes[5] = new Circle("silver", 7);
        shapes[6] = new Rectangle("orange", 3, 6);
        shapes[7] = new Circle("purple", 3);
        shapes[8] = new Rectangle("yellow", 3, 6);
        shapes[9] = new Rectangle("pink", 3, 6);

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
