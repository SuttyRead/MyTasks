package LabWork.LabWork2_6_1.brainacad.carpack;

public class Car {
    private double[] arr;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double[] setMass(int SIZE) {
        arr = new double[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100 * Math.random());
        }
        return arr;
    }

    public double[] getMass(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }
}
