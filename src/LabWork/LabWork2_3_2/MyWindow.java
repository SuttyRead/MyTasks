package LabWork.LabWork2_3_2;

public class MyWindow {
    private String firstName;
    private String lastName;
    private int age;
    private int growth;
    private int weight;


    MyWindow() {
        System.out.println("Create new object");
        firstName = "null";
        lastName = "null";
        age = 0;
        growth = 0;
        weight = 0;
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
