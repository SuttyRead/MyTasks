package LabWork.LabWork2_7_10;

public class Circle extends Shape {

    protected static double sumCircleArea = 0;
    private double radius;
    private double PI = Math.PI;

    {
        radius = 4;
    }

    Circle() {

    }

    public Circle(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double areaCircle = PI * radius * radius;
        sumCircleArea += areaCircle;
        return areaCircle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                ", colour='" + colour + '\'' +
                '}';
    }

    public double getSumCircleArea() {
        return sumCircleArea;
    }

    public void setSumCircleArea(double sumCircleArea) {
        this.sumCircleArea = sumCircleArea;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
