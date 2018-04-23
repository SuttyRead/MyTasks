package LabWork.LabWork2_2_5;

import java.util.Scanner;

public class A {
    private final double PI = 3.14;
    private double radiusCircle;
    private double sideSquare;
    private double lengthRectangle;
    private double widthRectangle;

    A() {
        this.radiusCircle = 10;
        this.widthRectangle = 15;
        this.sideSquare = 7;
        this.lengthRectangle = 2;
    }

    public double getRadiusCircle() {
        return radiusCircle;
    }

    public void setRadiusCircle(double radiusCircle) {
        this.radiusCircle = radiusCircle;
    }

    public double getSideSquare() {
        return sideSquare;
    }

    public void setSideSquare(double sideSquare) {
        this.sideSquare = sideSquare;
    }

    public double getLengthRectangle() {
        return lengthRectangle;
    }

    public void setLengthRectangle(double lengthRectangle) {
        this.lengthRectangle = lengthRectangle;
    }

    public double getWidthRectangle() {
        return widthRectangle;
    }

    public void setWidthRectangle(double widthRectangle) {
        this.widthRectangle = widthRectangle;
    }

    public void calculateSquare() {
        double areaCircle = PI * radiusCircle;
        double areaSquare = sideSquare * sideSquare;
        double areaRectangle = lengthRectangle * widthRectangle;
        System.out.println("AreaCircle = " + areaCircle);
        System.out.println("AreaSquare = " + areaSquare);
        System.out.println("AreaRectangle = " + areaRectangle);
    }

    public void initial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius circle: ");
        setRadiusCircle(sc.nextDouble());
        System.out.println("Enter side Square: ");
        setSideSquare(sc.nextDouble());
        System.out.println("Enter length rectangle: ");
        setLengthRectangle(sc.nextDouble());
        System.out.println("Enter width rectangle: ");
        setWidthRectangle(sc.nextDouble());
    }
}
