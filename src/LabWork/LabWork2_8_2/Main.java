package LabWork.LabWork2_8_2;


public class Main {
    public static void main(String[] args) {

        final int COUNTER = 3;


        Shape[] shapes = new Shape[COUNTER];

        shapes[0] = new Triangle();
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            shapes[i].calculateArea();
        }
    }
}
