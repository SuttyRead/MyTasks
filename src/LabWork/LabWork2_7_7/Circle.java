package LabWork.LabWork2_7_7;

public class Circle extends Shape {

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
}
