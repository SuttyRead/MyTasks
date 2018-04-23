package LabWork.LabWork2_3_1;

public class MyWindow {

    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow(double width) {
        this.width = width;
    }

    public MyWindow(double width, double height) {
        this(width);
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width, height);
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color) {
        this(width, height, numberOfGlass);
        this.color = color;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this(width, height, numberOfGlass, color);
        this.isOpen = isOpen;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumberOfGlass() {
        return numberOfGlass;
    }

    public void setNumberOfGlass(int numberOfGlass) {
        this.numberOfGlass = numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void printFields() {
        System.out.println("Width = " + getWidth() + "\nheight = "
                + getHeight() + "\nNumberOfGlass = " + getNumberOfGlass()
                + "\ncolor = " + getColor() + "\nisOpen = " + isOpen());
    }


}
