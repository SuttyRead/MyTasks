package LabWork.LabWork2_4_7;

//Write a program that computes the distance an object will fall in Earth's gravity.
//Create a new class called GravityCalculator with method calculateDistance(double time)
//that takes double  time, and returns the position of an object after falling for time
//seconds (outputting the position in meters). The formula in Math notation is:
//x(t) = 0.5 × a × time 2 + vi × time + xi
//Where:
//a - Acceleration (m/s2 ) = -9.81
//t - Time (s) (for example t = 10)
//vi - Initial velocity (m/s) = 0
//xi - Initial position = 0
//Declare acceleration value field as a constant;

public class Main {
    public static void main(String[] args) {
        GravityCalculation gravityCalculation = new GravityCalculation();
        System.out.println(gravityCalculation.calculateDistance(10));

    }
}
