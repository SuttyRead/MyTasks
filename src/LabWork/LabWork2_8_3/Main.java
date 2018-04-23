package LabWork.LabWork2_8_3;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape rectangle2 = new Rectangle(10, 16);
        rectangle.calculateArea();
        rectangle2.calculateArea();
        System.out.println(rectangle.compareTo(rectangle2));
    }
}
