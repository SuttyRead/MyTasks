package LabWork.LabWork2_4_4;

//1) Create Employee class with fields firstName, lastName,
//occupation, telephone and static field numberOfEmployees and getters/setters.
//2) Class must have constructor, which will initialize class fields and increment numberOfEmployees.
//3) Create multiple instances of Employee class and the output numberOfEmployees field to the console.

public class Main {
    public static void main(String[] args) {
        Employee ivanov = new Employee();
        Employee petrov = new Employee();
        Employee sidorov = new Employee();
        System.out.println(Employee.getNumberOfEmployees());
        ivanov.initial();
        petrov.initial();
        sidorov.initial();
        ivanov.outputOfEmployees();
        petrov.outputOfEmployees();
        sidorov.outputOfEmployees();
    }
}
