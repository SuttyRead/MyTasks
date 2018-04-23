package LabWork.LabWork2_8_5;


public class Triangle extends Shape implements Comparable, Drawable {

    private double a;
    private double b;
    private double c;
    private double areaTriangle;

    {
        this.a = 5;
        this.b = 5;
        this.c = 5;
    }

    public Triangle(String colour, double a, double b, double c) {
        super(colour);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        areaTriangle = Math.sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c));
        return areaTriangle;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", colour='" + colour + '\'' +
                '}';
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public void draw() {
        System.out.println("This is Rectangle, color = " + this.colour + ", a = " + this.a + ", b = " + this.b + "c = " + this.c + ",  areaTriangle is: " + this.areaTriangle);
    }


    @Override
    public int compareTo(Object o) {
        Triangle triang = (Triangle) o;

        if (triang.areaTriangle < this.areaTriangle) {
            return 1;
        }

        if (triang.areaTriangle > this.areaTriangle) {
            return -1;
        }
        return 0;
    }
}
