package LabWork.LabWork2_8_3;

public abstract class Shape implements Comparable {

    protected String colour;


    public Shape() {

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
