package LabWork.LabWork2_8_3;

public class Circle extends Shape implements Comparable {

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
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                ", colour='" + colour + '\'' +
                '}';
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
