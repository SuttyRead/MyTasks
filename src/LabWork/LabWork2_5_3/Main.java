package LabWork.LabWork2_5_3;

//Change MyInit class:
//change MyInit field arr to static field.
//Compile and run. What will you see and why?

//Answer

//Objects do not change the static variable, because it changes the value of the class

public class Main {
    public static void main(String[] args) {
        MyInit myInit1 = new MyInit();
        MyInit myInit2 = new MyInit();
        myInit1.printArray(myInit1.getArr());
        myInit2.printArray(myInit2.getArr());
    }
}
