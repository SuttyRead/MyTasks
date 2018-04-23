package LabWork.LabWork2_5_3;

//Change MyInit class:
//change MyInit field arr to static field.
//Compile and run. What will you see and why?

//Answer:

//A static block is run only once when it is loaded into memory.


public class MyInit {
    private static int arr[] = new int[10];

    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100 * Math.random());
        }
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int[] printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }

}