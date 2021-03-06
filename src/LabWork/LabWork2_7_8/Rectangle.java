package LabWork.LabWork2_7_8;

public class Rectangle extends Shape {
    private double length;
    private double width;

    {
        setColour("red");
        this.length = 10;
        this.width = 15;
    }


    public Rectangle() {
        counter++;
    }

    public Rectangle(String colour, double length, double width) {
        super(colour);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", colour='" + colour + '\'' +
                '}';
    }
}
