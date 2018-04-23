package Exercise.Exercise_1;

//Сила тяжести на Луне примерно равна 17%,
//напишите программу, которая вычисляет ваш вес на Луне.

public class Main {
    public static void main(String[] args) {
        Earth earth = new Earth();
        Moon moon = new Moon();
        earth.setMassEarth(earth.getWeightEarth() * earth.getGravityEarth());
        System.out.println("MassEarth = " + earth.getMassEarth());
        Work.exersize(moon, earth);
        moon.setMassMoon(moon.getWeightMoon() * moon.getGravityMoon());
        System.out.println("MassMoon = " + moon.getMassMoon());
    }
}
