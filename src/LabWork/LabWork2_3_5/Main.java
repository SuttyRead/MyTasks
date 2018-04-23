package LabWork.LabWork2_3_5;

//Create array of MyWindow’s and fill it by creating MyWindow’s objects using different constructors.
//Call method printFields() on each array element.

public class Main {

    public static void main(String[] args) {

        Work work = new Work();
        MyWindow[] myWindows = new MyWindow[3];

        for (int i = 0; i < myWindows.length; i++) {
            myWindows[i] = new MyWindow();
            work.initial(myWindows[i]);
        }

        for (MyWindow myWindow : myWindows) {
            work.printFields(myWindow);
        }

    }

}
