package LabWork.LabWork2_3_1;

//Create class MyWindow with fields width (of double type),
//height (of double type), numberOfGlass(of int type), color
//(of  String type), isOpen(boolean).
//2) Create five instances of class MyWindow  with different  fields values.
//3) Add method printFields()  to  MyWindow class  that print all fields values to console.

public class Main {
    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow(15, 10, 18, "red", true);
        myWindow.printFields();

    }
}
