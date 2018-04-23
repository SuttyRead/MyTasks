package LabWork.LabWork2_5_5;

//Write class InitTest with private field id of int type
//and static private field nextId of integer. Write code that:
//Initialize static field nextId of some random value
//(in 1 … 1000 range) once when class loaded to JVM;
//Increments  static field nextId each time when new
//instance of InitTest created;
//Initialize field id of nextId field value each timewhen
//new instance of InitTest created.
//And method getId() which will return value of id.
//Create class Main, which will create five instances of class
//InitTest and invokes method getId() on each instance and print returned value on console.

public class Main {
    public static void main(String[] args) {
        MyInit myInit1 = new MyInit();
        MyInit myInit2 = new MyInit();
        MyInit myInit3 = new MyInit();
        MyInit myInit4 = new MyInit();
        MyInit myInit5 = new MyInit();

        System.out.println("First object: " + myInit1.getId());
        System.out.println("Second object: " + myInit2.getId());
        System.out.println("Third object: " + myInit3.getId());
        System.out.println("Fourth object: " + myInit4.getId());
        System.out.println("Fifth object: " + myInit5.getId());


    }
}
