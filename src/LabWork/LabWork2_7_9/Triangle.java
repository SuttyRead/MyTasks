package LabWork.LabWork2_7_9;

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    {
        this.a = 5;
        this.b = 5;
        this.c = 5;
    }

    @Override
    public double calculateArea() {
        return Math.sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", colour='" + colour + '\'' +
                '}';
    }
}
