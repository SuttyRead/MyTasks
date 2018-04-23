package LabWork.LabWork2_8_3;

public class Triangle extends Shape implements Comparable {

    private double a;
    private double b;
    private double c;
    private double area;

    {
        this.a = 5;
        this.b = 5;
        this.c = 5;
    }

    @Override
    public double calculateArea() {
        area = Math.sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c));
        return area;
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

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
