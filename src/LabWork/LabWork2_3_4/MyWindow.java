package LabWork.LabWork2_3_4;

public class MyWindow {

    private int width;
    private int height;
    private int numberOfGlass;

    public MyWindow() {
        System.out.println("Create new object!!!");
    }

    public MyWindow(int width) {
        this.width = width;
    }

    public MyWindow(int width, int height) {
        this(width);
        this.height = height;
    }

    public MyWindow(int width, int height, int numberOfGlass) {
        this(width, height);
        this.numberOfGlass = numberOfGlass;
    }
}

