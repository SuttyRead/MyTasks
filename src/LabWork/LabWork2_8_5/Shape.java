package LabWork.LabWork2_8_5;

public abstract class Shape implements Comparable, Drawable {

    protected String colour;

    public Shape() {

    }

    public Shape(String colour) {
        this.colour = colour;
    }

    @Override
    public abstract void draw();

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
