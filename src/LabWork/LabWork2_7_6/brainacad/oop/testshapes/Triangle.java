package LabWork.LabWork2_7_6.brainacad.oop.testshapes;

public class Triangle extends Shape {
    private double h;
    private double length;

    {
        setColour("red");
        this.h = 5;
        this.length = 20;
    }

    public Triangle() {
        counter++;
    }

    public Triangle(String colour, double h, double length) {
        super(colour);
        this.h = h;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return h * length * 0.5;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "h=" + h +
                ", length=" + length +
                ", colour='" + colour + '\'' +
                '}';
    }
}
