package LabWork.LabWork2_6_1.example.applepack.testpack;

import com.LabWork.LabWork2_6_1.brainacad.carpack.Car;
import com.LabWork.LabWork2_6_1.example.applepack.Apple;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Car car = new Car();
        apple.getMass(apple.setMass(10));
        car.getMass(car.setMass(10));

    }
}
