package LabWork.LabWork2_6_5;

public class Triangle {

    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        return Math.sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c));
    }

}
