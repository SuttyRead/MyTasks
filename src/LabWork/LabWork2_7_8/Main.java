package LabWork.LabWork2_7_8;

//1) Add to project  MyShapes a new class Rectangle which is a subclass of Shape.
//Add to class Rectangle a private field’s width and height (of double type).
//In class Rectangle override  calculateArea() method which must return area of rectangle
//(By the formula:  area  = width* height).
//In class Rectangle override the toString() method. It must return string which contain name of shape, color and rectangle width and height. Example:
//“This is Rectangle, color: RED, width=11, height=22”
//Add to class Rectangle constructor with color, width and height arguments.
//2) Then add to class Main code to create one Rectangle object and print it name, color, width and height to console. Then invoke calculateArea() method and print result to console.
//Program output must looks like:
//“This is Rectangle, color: RED, width=11, height=22”
//“Shape area is: 242”


public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.toString());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}
