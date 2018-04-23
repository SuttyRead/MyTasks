package LabWork.LabWork2_5_2;

//Create class MyInit with field array of array of integers and non-static initialization block which will initialize that array with random values (Size of array is 10).
//To generate random numbers you can use next code:
//array[i]= (int) (100 * Math.random()).
//(Or using Random class instance and nextInt() method invocation).
//Add to class MyInit and method printArray() which will print values of this array.
//Create class Main, which will create two instances of class MyInit and invoke method printArray() to print values of their arrays on console.
//Example of output:
//23,43,11,34,78,59,34,61,24,2
//5,48,50,3,1,4,67,62,78,98


public class Main {
    public static void main(String[] args) {
        MyInit myInit1 = new MyInit();
        MyInit myInit2 = new MyInit();
        myInit1.printArray(myInit1.getArr());
        myInit2.printArray(myInit2.getArr());
    }
}
