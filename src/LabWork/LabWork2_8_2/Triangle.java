package LabWork.LabWork2_8_2;

public class Triangle extends Shape implements Drawable {

    protected static double sumTriangleArea = 0;
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
        double areaTriangle = Math.sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c));
        sumTriangleArea += areaTriangle;
        return areaTriangle;
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

    public double getSumTriangleArea() {
        return sumTriangleArea;
    }

    public void setSumTriangleArea(double sumTriangleArea) {
        this.sumTriangleArea = sumTriangleArea;
    }

    @Override
    public void draw() {
        System.out.println("Draw triangle");
    }
}
