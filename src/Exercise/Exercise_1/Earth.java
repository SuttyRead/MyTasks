package Exercise.Exercise_1;

public class Earth {
    private String nameEarth;
    private double weightEarth;
    private double gravityEarth;
    private double massEarth;

    Earth() {
        this.nameEarth = "Roman";
        this.weightEarth = 72;
        this.gravityEarth = 9.8;
    }

    public double getMassEarth() {
        return massEarth;
    }

    public void setMassEarth(double massEarth) {
        this.massEarth = massEarth;
    }

    @Override
    public String toString() {
        return "Earth{" +
                "nameEarth='" + nameEarth + '\'' +
                ", weightEarth=" + weightEarth +
                ", gravityEarth=" + gravityEarth +
                ", massEarth=" + massEarth +
                '}';
    }

    public String getNameEarth() {
        return nameEarth;
    }

    public void setNameEarth(String nameEarth) {
        this.nameEarth = nameEarth;
    }

    public double getWeightEarth() {
        return weightEarth;
    }

    public void setWeightEarth(double weightEarth) {
        this.weightEarth = weightEarth;
    }

    public double getGravityEarth() {
        return gravityEarth;
    }

    public void setGravityEarth(double gravityEarth) {
        this.gravityEarth = gravityEarth;
    }
}
