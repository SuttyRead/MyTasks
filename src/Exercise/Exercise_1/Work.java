package Exercise.Exercise_1;

public class Work {
    public static void exersize(Moon moon, Earth earth) {
        double tempGravity = earth.getGravityEarth();
        tempGravity *= 0.17;
        moon.setGravityMoon(tempGravity);
    }
}
