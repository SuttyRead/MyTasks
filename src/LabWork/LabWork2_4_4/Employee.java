package LabWork.LabWork2_4_4;

import java.util.Scanner;

public class Employee {
    private static int numberOfEmployees;
    private String firstName;
    private String lastName;
    private String profession;

    public Employee() {
        numberOfEmployees++;
    }

    public Employee(String firstName) {
        this.firstName = firstName;
    }

    public Employee(String firstName, String lastName) {
        this(firstName);
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName, String profession) {
        this(firstName, lastName);
        this.profession = profession;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        Employee.numberOfEmployees = numberOfEmployees;
    }

    public void initial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstname: ");
        setFirstName(sc.nextLine());
        System.out.println("Enter lastName: ");
        setLastName(sc.nextLine());
        System.out.println("Enter his profession");
        setProfession(sc.nextLine());
    }

    public void outputOfEmployees() {
        System.out.println("Firstname: " + firstName);
        System.out.println("Lastname: " + lastName);
        System.out.println("Profession: " + profession);
        System.out.println();
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
