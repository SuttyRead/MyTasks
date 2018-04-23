package LabWork.LabWork2_2_3;

import java.util.Scanner;

public class Employee {
    private int associateSalary;

    Employee() {
        associateSalary = 3200;
    }

    public int getAssociateSalary() {
        return associateSalary;
    }

    public void setAssociateSalary(int associateSalary) {
        this.associateSalary = associateSalary;
    }

    public void calculateSalary(Employee nameP) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time work(month): ");
        int tempTimeWork = sc.nextInt();
        int tempSalary = nameP.getAssociateSalary();
        tempSalary *= tempTimeWork;
        System.out.print("Name" + nameP);
        System.out.print(", salary = " + getAssociateSalary());
        System.out.print(", total salary = " + tempSalary);
        System.out.println(", time work: " + tempTimeWork);

    }
}

