package Exercise.Exercise_1;

public class Moon {
    private String nameMoon;
    private double weightMoon;
    private double gravityMoon;
    private double massMoon;

    Moon() {
        this.nameMoon = "Roman";
        this.weightMoon = 72;
    }

    public double getMassMoon() {
        return massMoon;
    }

    public void setMassMoon(double massMoon) {
        this.massMoon = massMoon;
    }

    @Override
    public String toString() {
        return "Moon{" +
                "nameMoon='" + nameMoon + '\'' +
                ", weightMoon=" + weightMoon +
                ", gravityMoon=" + gravityMoon +
                ", massMoon=" + massMoon +
                '}';
    }

    public String getNameMoon() {
        return nameMoon;
    }

    public void setNameMoon(String nameMoon) {
        this.nameMoon = nameMoon;
    }

    public double getWeightMoon() {
        return weightMoon;
    }

    public void setWeightMoon(double weightMoon) {
        this.weightMoon = weightMoon;
    }

    public double getGravityMoon() {
        return gravityMoon;
    }

    public void setGravityMoon(double gravityMoon) {
        this.gravityMoon = gravityMoon;
    }
}
