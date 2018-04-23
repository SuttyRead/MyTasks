package LabWork.LabWork2_7_10;

//Use MyShapes project. The program must demonstrate the creation of an array of different types of shapes and print characteristics of each shape on console.
//Add new code to method main() in class Main:
//Create array (Shape[] arr) of different Shape objects, (five  rectangles, two circles and two triangles);
//Add code to iterate over shapes array in loop (use for-each loop) and print characteristics of each shape on console (using toString() method) with area of this shape (using calculateArea() method).
//Execute the program, output must looks like:
//
//This is Rectangle, color: RED, width=11, height=22,  area is: 242
//This is Triangle, color: BLACK, a=5, b=5, c=5, area is: 10.825
//This is Circle, color: GREEN, radius=10, area is: 314.15926
//…
//Add code to calculate total area of all shape types. Define sumArea (of double type) local variable and use it in loop to sum total area for all shapes.
//Add code to sum total area for each shape types. Define sumRectArea, sumTriangleArea, sumCircleArea (of double type) local variables and use it in loop to sum total area for each shape type. You should use instanceof keyword for determining, total area for each of shape types (Rectangle, Circle, Triangle) and print it to console.
//Execute the program, output must looks like:
//Rectangles total area: 234.54
//Circle total area: 547.231
//Triangle total area: 356.56


public class Main {
    public static void main(String[] args) {


        Shape triangle1 = new Triangle();
        Shape triangle2 = new Triangle();
        Shape rectangle1 = new Rectangle();
        Shape rectangle2 = new Rectangle();
        Shape rectangle3 = new Rectangle();
        Shape rectangle4 = new Rectangle();
        Shape rectangle5 = new Rectangle();
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();

        Shape[] shapes = new Shape[Shape.counter];

        shapes[0] = triangle1;
        shapes[1] = triangle2;
        shapes[2] = rectangle1;
        shapes[3] = rectangle2;
        shapes[4] = rectangle3;
        shapes[5] = rectangle4;
        shapes[6] = rectangle5;
        shapes[7] = circle1;
        shapes[8] = circle2;

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            shapes[i].calculateArea();
        }


        System.out.println("Sum area Rectangle: " + Rectangle.sumRecArea);
        System.out.println("Sum area Circle: " + Circle.sumCircleArea);
        System.out.println("Sum area Triangle: " + Triangle.sumTriangleArea);
    }
}
