package LabWork.LabWork2_8_2;

public abstract class Shape implements Drawable {
    double sumArea = 0;
    private String colour;

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
