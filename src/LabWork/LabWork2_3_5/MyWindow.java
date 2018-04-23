package LabWork.LabWork2_3_5;

public class MyWindow {
    private String firstName;
    private String lastName;
    private int age;
    private int growth;
    private int weight;

    public MyWindow() {
        System.out.println("Create new object!!!");
    }

    public MyWindow(String firstName) {
        this.firstName = firstName;
    }

    public MyWindow(String firstName, String lastName) {
        this(firstName);
        this.lastName = lastName;
    }

    public MyWindow(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
    }

    public MyWindow(String firstName, String lastName, int age, int growth) {
        this(firstName, lastName, age);
        this.growth = growth;
    }

    public MyWindow(String firstName, String lastName, int age, int growth, int weight) {
        this(firstName, lastName, age, growth);
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}
