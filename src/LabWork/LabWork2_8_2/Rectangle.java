package LabWork.LabWork2_8_2;

public class Rectangle extends Shape implements Drawable {
    protected static double sumRecArea = 0;
    private double length;
    private double width;

    {
        setColour("red");
        this.length = 10;
        this.width = 15;
    }

    public Rectangle() {

    }

    public Rectangle(String colour, double length, double width) {
        super(colour);
        this.length = length;
        this.width = width;
    }

    public double getSumRecArea() {
        return sumRecArea;
    }

    public void setSumRecArea(double sumRecArea) {
        this.sumRecArea = sumRecArea;
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
        double areaRectangle = length * width;
        sumRecArea += areaRectangle;
        return areaRectangle;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("Draw rectangle");
    }
}
