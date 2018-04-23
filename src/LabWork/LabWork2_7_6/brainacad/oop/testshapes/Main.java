package LabWork.LabWork2_7_6.brainacad.oop.testshapes;


//Create new project named MyShapes. Add package “com.brainacad.oop.testshapes”.
//You should design a super class Shape, which defines the public method of all the shapes called calculateArea(), which returns the area (double type) of that particular shape. (Our program uses many kinds of shapes, such as triangle, rectangle and so on.)
//Define a Shape class as:
//public class Shape {
//declare private instance variable color of String type
//create a constructor for Shape with color parameter
//Override  toString() to return the string of Shape name and color, example:
//“Shape, color is: RED”
//All shapes must has a method called calculateArea(), write public method (empty)  calculateArea() that returns double value ( 0.0 ) .
//Create class Main with method main().
//The program must demonstrate the creation of one Shape object and print it name and color to console. Then add code to invoke calculateArea() method and print result to console.
//Program output must looks like:
//“This is Shape, color is: RED”
//“Shape area is: 0”

public class Main {
    public static void main(String[] args) {

        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();

        Shape[] shapes = new Shape[Shape.counter];

        shapes[0] = triangle;
        shapes[1] = rectangle;

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }

        System.out.println("triangle area: " + triangle.calculateArea());
        System.out.println("rectangle area: " + rectangle.calculateArea());

    }
}
