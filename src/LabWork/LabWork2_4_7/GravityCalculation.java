package LabWork.LabWork2_4_7;

public class GravityCalculation {
    private final double a = -9.81d;
    private double time;
    private double vi;
    private double xi;
    private double x;

    GravityCalculation() {
        this.time = 10;
        this.vi = 0;
        this.xi = 0;

    }

    public double calculateDistance(double time) {

        x = 0.5 * a * time * time + vi * time + xi;

        return x;
    }
}
