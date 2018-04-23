package LabWork.LabWork2_8_1;


public abstract class Shape {
    String colour;
    double sumArea = 0;

    {
        this.colour = "red";
    }

    public Shape(String colour) {
        this.colour = colour;
    }

    public abstract double calculateArea();

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
