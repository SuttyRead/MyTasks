package LabWork.LabWork2_8_5;

public class Rectangle extends Shape implements Comparable, Drawable {

    private double length;
    private double width;
    private double areaRect;


    {
        setColour("red");
        this.length = 10;
        this.width = 15;
    }


    public Rectangle() {

    }

    public Rectangle(double length) {
        this.length = length;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
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
        areaRect = length * width;
        return areaRect;
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
    public int compareTo(Object o) {
        Rectangle rect = (Rectangle) o;

        if (rect.areaRect < this.areaRect) {
            return 1;
        }

        if (rect.areaRect > this.areaRect) {
            return -1;
        }
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("This is Rectangle, color = " + this.colour + ", width = " + this.width + ", height = " + this.length + ",  areaRect is: " + this.areaRect);
    }
}
