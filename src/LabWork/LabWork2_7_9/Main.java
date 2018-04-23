package LabWork.LabWork2_7_9;

//1) Add to project  MyShapes a new class Triangle which is a subclass of Shape.
//Add to class Triangle a private field’s a, b, c (of double type) which is sides of triangle.
//In class Triangle override  calculateArea() method which must return area of triangle
//(By the formula:  area  = , where ).
//In class Triangle override the toString() method. It must return string which contain name of shape, color and a, b, c sides of triangle. Example:
//“This is Triangle, color: BLACK, a=5, b=5, c=5”
//Add to class Triangle constructor with color, a, b and c arguments.
//2) Then add to class Main code to create one Triangle object and print it name, color, a, b, c sides of triangle to console. Then invoke calculateArea() method and print result to console.
//Program output must looks like:
//“This is Triangle, color: BLACK, a=5, b=5, c=5”
//“Shape area is: 10.825”


public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        System.out.println(triangle.toString());
        System.out.println(triangle.calculateArea());

    }
}
