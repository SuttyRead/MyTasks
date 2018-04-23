package LabWork.LabWork2_7_9;

public class Shape {
    public static int counter = 0;
    protected String colour;

    {
        this.colour = "red";
    }

    public Shape() {

    }

    public Shape(String colour) {
        this.colour = colour;
    }

    public double calculateArea() {

        double area = 1;
        return area;

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
