package LabWork.LabWork2_7_7;

//1) Add to project  MyShapes a new class Circle which is a subclass of Shape.
//Add to class Circle a private field radius (of double type).
//In class Circle override  calculateArea() method which must return area of circle
//(by the formula:  area  = PI*radius2).
//In class Circle override the toString() method. It must return string which contain name of shape, color and radius of circle. Example:
//This is Circle, color: GREEN, radius=22”
//Add to class Circle constructor with color and radius arguments.
//2) Then add to class Main code to create one Circle object and print it name color, and radius to console. Then invoke calculateArea() method and print result to console.
//Program output must looks like:
//“This is Circle, color: GREEN, radius=10”
//“Shape area is: 314.15926”


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.calculateArea());
    }
}
