package LabWork.LabWork2_8_5;


public class Circle extends Shape implements Comparable, Drawable {

    private double radius;
    private double PI = Math.PI;
    private double areaCircle;


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
        areaCircle = PI * radius * radius;
        return areaCircle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                ", colour='" + colour + '\'' +
                '}';
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("This is Circle, color = " + this.colour + ", radius = " + this.radius + ",  area is: " + this.areaCircle);
    }


    @Override
    public int compareTo(Object o) {
        Circle circ = (Circle) o;

        if (circ.areaCircle < this.areaCircle) {
            return 1;
        }

        if (circ.areaCircle > this.areaCircle) {
            return -1;
        }
        return 0;
    }
}
